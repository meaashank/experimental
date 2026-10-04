package com.tencent.cos.xml.exception;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.qcloud.core.common.QCloudClientException;

/* JADX INFO: loaded from: classes7.dex */
public class CosXmlClientException extends QCloudClientException {
    private static final long serialVersionUID = 1;
    public final int errorCode;

    public CosXmlClientException(int i10, String str, Throwable th) {
        super(str, th);
        this.errorCode = i10;
    }

    public static CosXmlClientException internalException(String str) {
        return new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), str);
    }

    public static CosXmlClientException manualCancelException() {
        return new CosXmlClientException(ClientErrorCode.USER_CANCELLED);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CosXmlClientException{errorCode=" + this.errorCode + "message=" + getMessage() + '}';
    }

    public CosXmlClientException(ClientErrorCode clientErrorCode) {
        this(clientErrorCode.getCode(), clientErrorCode.getErrorMsg());
    }

    public CosXmlClientException(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }

    public CosXmlClientException(int i10, Throwable th) {
        super(th);
        this.errorCode = i10;
    }
}
