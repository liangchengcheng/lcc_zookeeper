package com.lcc.http;

import com.google.common.util.concurrent.ListenableFuture;
import com.lcc.http.ext.AuthSSLInitializationError;
import org.apache.commons.httpclient.HttpMethodBase;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

/**
 * Created by lcc on 2016/11/22.
 */
public class SyncHttpClient extends AbstractHttpClient {

    private ResponseWrapper doMethod(HttpMethodBase method) {
        ResponseWrapper wrapper = null;
        try {
            /** we blocked here */
            httpClient.executeMethod(method);
            wrapper = ResponseWrapper.of(method);
            callBack.onSuccess(wrapper);
        } catch (Throwable e) { //not only exp
            if (e instanceof AuthSSLInitializationError) {
                callBack.onAuthority((AuthSSLInitializationError) e);
            } else {
                callBack.onFailure(e);
            }
        } finally {
            method.releaseConnection();
        }
        return wrapper;
    }

    @Override
    public ResponseWrapper get(String uri) {
        checkArgument(!isNullOrEmpty(uri), "uri值错误");
        return doMethod(buildGetMethod(uri));
    }

    @Override
    public ResponseWrapper post(String uri, String content) {
        checkArgument(!isNullOrEmpty(uri), "uri值错误");
        checkArgument(!isNullOrEmpty(content), "content值错误");
        return doMethod(buildPostMethod(uri, content));
    }

    @Override
    public ResponseWrapper post(String uri) {
        checkArgument(!isNullOrEmpty(uri), "uri值错误");
        return doMethod(buildPostMethod(uri, null));
    }

    @Override
    public ListenableFuture<ResponseWrapper> asyncGet(String uri) {
        throw new UnsupportedOperationException("同步客户端不支持调用同步方法，请调用 get");
    }

    @Override
    public ListenableFuture<ResponseWrapper> asyncPost(String uri, String content) {
        throw new UnsupportedOperationException("同步客户端不支持调用同步方法，请调用 post");
    }

    @Override
    public ListenableFuture<ResponseWrapper> asyncPost(String uri) {
        throw new UnsupportedOperationException("同步客户端不支持调用同步方法，请调用 post");
    }

}

