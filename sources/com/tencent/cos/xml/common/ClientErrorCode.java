package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes7.dex */
public enum ClientErrorCode {
    UNKNOWN(-10000, "Unknown Error"),
    INVALID_ARGUMENT(10000, "InvalidArgument"),
    INVALID_CREDENTIALS(10001, "InvalidCredentials"),
    BAD_REQUEST(10002, "BadRequest"),
    SINK_SOURCE_NOT_FOUND(10003, "SinkSourceNotFound"),
    ETAG_NOT_FOUND(10004, "ETagNotFound"),
    INTERNAL_ERROR(20000, "InternalError"),
    SERVERERROR(20001, "ServerError"),
    IO_ERROR(20002, "IOError"),
    POOR_NETWORK(20003, "NetworkError"),
    NETWORK_NOT_CONNECTED(20004, "NetworkNotConnected"),
    USER_CANCELLED(30000, "UserCancelled"),
    ALREADY_FINISHED(30001, "AlreadyFinished"),
    DUPLICATE_TASK(30002, "DuplicateTask"),
    KMS_ERROR(40000, "KMSError");

    private int code;
    private String errorMsg;

    ClientErrorCode(int i10, String str) {
        this.code = i10;
        this.errorMsg = str;
    }

    public static ClientErrorCode to(int i10) {
        for (ClientErrorCode clientErrorCode : values()) {
            if (clientErrorCode.code == i10) {
                return clientErrorCode;
            }
        }
        throw new IllegalArgumentException("not error code defined");
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
