package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y<T> {

    public static final class b extends y<byte[]> {
        public b() {
        }

        @Override // com.tencent.qcloud.core.http.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] convert(h<byte[]> hVar) throws QCloudServiceException, QCloudClientException {
            try {
                return hVar.b();
            } catch (IOException e10) {
                throw new QCloudClientException(e10);
            }
        }

        public b(a aVar) {
        }
    }

    public static final class c extends y<InputStream> {
        public c() {
        }

        public InputStream a(h<InputStream> hVar) throws QCloudServiceException, QCloudClientException {
            return hVar.a();
        }

        @Override // com.tencent.qcloud.core.http.y
        public InputStream convert(h<InputStream> hVar) throws QCloudServiceException, QCloudClientException {
            return hVar.a();
        }

        public c(a aVar) {
        }
    }

    public static final class d extends y<String> {
        public d() {
        }

        @Override // com.tencent.qcloud.core.http.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(h<String> hVar) throws QCloudServiceException, QCloudClientException {
            try {
                return hVar.k();
            } catch (IOException e10) {
                throw new QCloudClientException(e10);
            }
        }

        public d(a aVar) {
        }
    }

    public static y<byte[]> bytes() {
        return new b();
    }

    public static y<Void> file(String str) {
        return file(str, -1L);
    }

    public static y<InputStream> inputStream() {
        return new c();
    }

    public static y<String> string() {
        return new d();
    }

    public abstract T convert(h<T> hVar) throws QCloudServiceException, QCloudClientException;

    public static y<Void> file(String str, long j10) {
        return new z(str, j10);
    }
}
