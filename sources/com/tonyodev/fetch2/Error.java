package com.tonyodev.fetch2;

import com.prism.lib_google_billing.q;
import com.tonyodev.fetch2core.Downloader;
import dd.o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Error {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ Error[] $VALUES;
    public static final Error COMPLETED_NOT_ADDED_SUCCESSFULLY;

    @NotNull
    public static final a Companion;
    public static final Error ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
    public static final Error ENQUEUE_NOT_SUCCESSFUL;
    public static final Error FAILED_TO_ADD_COMPLETED_DOWNLOAD;
    public static final Error FAILED_TO_RENAME_FILE;
    public static final Error FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
    public static final Error FAILED_TO_UPDATE_REQUEST;
    public static final Error FETCH_FILE_SERVER_INVALID_RESPONSE;
    public static final Error FETCH_FILE_SERVER_URL_INVALID;
    public static final Error FILE_ALLOCATION_FAILED;
    public static final Error FILE_NOT_FOUND;
    public static final Error HTTP_CONNECTION_NOT_ALLOWED;
    public static final Error INVALID_CONTENT_HASH;
    public static final Error NO_NETWORK_CONNECTION;
    public static final Error REQUEST_DOES_NOT_EXIST;
    public static final Error UNKNOWN = new Error(q.f194113a, 0, -1, null, null, 6, null);

    @Nullable
    private Downloader.a httpResponse;

    @Nullable
    private Throwable throwable;
    private final int value;
    public static final Error NONE = new Error("NONE", 1, 0, 0 == true ? 1 : 0, null, 6, null);
    public static final Error FILE_NOT_CREATED = new Error("FILE_NOT_CREATED", 2, 1, 0 == true ? 1 : 0, null, 6, null);
    public static final Error CONNECTION_TIMED_OUT = new Error("CONNECTION_TIMED_OUT", 3, 2, 0 == true ? 1 : 0, null, 6, null);
    public static final Error UNKNOWN_HOST = new Error("UNKNOWN_HOST", 4, 3, 0 == true ? 1 : 0, null, 6, null);
    public static final Error HTTP_NOT_FOUND = new Error("HTTP_NOT_FOUND", 5, 4, 0 == true ? 1 : 0, null, 6, null);
    public static final Error WRITE_PERMISSION_DENIED = new Error("WRITE_PERMISSION_DENIED", 6, 5, 0 == true ? 1 : 0, null, 6, null);
    public static final Error NO_STORAGE_SPACE = new Error("NO_STORAGE_SPACE", 7, 6, 0 == true ? 1 : 0, null, 6, null);
    public static final Error EMPTY_RESPONSE_FROM_SERVER = new Error("EMPTY_RESPONSE_FROM_SERVER", 9, 8, null, null, 6, null);
    public static final Error REQUEST_ALREADY_EXIST = new Error("REQUEST_ALREADY_EXIST", 10, 9, 0 == true ? 1 : 0, null, 6, null);
    public static final Error DOWNLOAD_NOT_FOUND = new Error("DOWNLOAD_NOT_FOUND", 11, 10, 0 == true ? 1 : 0, null, 6, null);
    public static final Error FETCH_DATABASE_ERROR = new Error("FETCH_DATABASE_ERROR", 12, 11, 0 == true ? 1 : 0, null, 6, null);
    public static final Error REQUEST_WITH_ID_ALREADY_EXIST = new Error("REQUEST_WITH_ID_ALREADY_EXIST", 13, 13, 0 == true ? 1 : 0, null, 6, null);
    public static final Error REQUEST_WITH_FILE_PATH_ALREADY_EXIST = new Error("REQUEST_WITH_FILE_PATH_ALREADY_EXIST", 14, 14, 0 == true ? 1 : 0, null, 6, 0 == true ? 1 : 0);
    public static final Error REQUEST_NOT_SUCCESSFUL = new Error("REQUEST_NOT_SUCCESSFUL", 15, 15, 0 == true ? 1 : 0, null, 6, 0 == true ? 1 : 0);
    public static final Error UNKNOWN_IO_ERROR = new Error("UNKNOWN_IO_ERROR", 16, 16, 0 == true ? 1 : 0, null, 6, null);

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final Error a(int i10) {
            switch (i10) {
                case -1:
                    return Error.UNKNOWN;
                case 0:
                    return Error.NONE;
                case 1:
                    return Error.FILE_NOT_CREATED;
                case 2:
                    return Error.CONNECTION_TIMED_OUT;
                case 3:
                    return Error.UNKNOWN_HOST;
                case 4:
                    return Error.HTTP_NOT_FOUND;
                case 5:
                    return Error.WRITE_PERMISSION_DENIED;
                case 6:
                    return Error.NO_STORAGE_SPACE;
                case 7:
                    return Error.NO_NETWORK_CONNECTION;
                case 8:
                    return Error.EMPTY_RESPONSE_FROM_SERVER;
                case 9:
                    return Error.REQUEST_ALREADY_EXIST;
                case 10:
                    return Error.DOWNLOAD_NOT_FOUND;
                case 11:
                    return Error.FETCH_DATABASE_ERROR;
                case 12:
                case 14:
                case 18:
                default:
                    return Error.UNKNOWN;
                case 13:
                    return Error.REQUEST_WITH_ID_ALREADY_EXIST;
                case 15:
                    return Error.REQUEST_NOT_SUCCESSFUL;
                case 16:
                    return Error.UNKNOWN_IO_ERROR;
                case 17:
                    return Error.FILE_NOT_FOUND;
                case 19:
                    return Error.FETCH_FILE_SERVER_URL_INVALID;
                case 20:
                    return Error.INVALID_CONTENT_HASH;
                case 21:
                    return Error.FAILED_TO_UPDATE_REQUEST;
                case 22:
                    return Error.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                case 23:
                    return Error.FETCH_FILE_SERVER_INVALID_RESPONSE;
                case 24:
                    return Error.REQUEST_DOES_NOT_EXIST;
                case 25:
                    return Error.ENQUEUE_NOT_SUCCESSFUL;
                case 26:
                    return Error.COMPLETED_NOT_ADDED_SUCCESSFULLY;
                case 27:
                    return Error.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                case 28:
                    return Error.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                case 29:
                    return Error.FAILED_TO_RENAME_FILE;
                case 30:
                    return Error.FILE_ALLOCATION_FAILED;
                case 31:
                    return Error.HTTP_CONNECTION_NOT_ALLOWED;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ Error[] $values() {
        return new Error[]{UNKNOWN, NONE, FILE_NOT_CREATED, CONNECTION_TIMED_OUT, UNKNOWN_HOST, HTTP_NOT_FOUND, WRITE_PERMISSION_DENIED, NO_STORAGE_SPACE, NO_NETWORK_CONNECTION, EMPTY_RESPONSE_FROM_SERVER, REQUEST_ALREADY_EXIST, DOWNLOAD_NOT_FOUND, FETCH_DATABASE_ERROR, REQUEST_WITH_ID_ALREADY_EXIST, REQUEST_WITH_FILE_PATH_ALREADY_EXIST, REQUEST_NOT_SUCCESSFUL, UNKNOWN_IO_ERROR, FILE_NOT_FOUND, FETCH_FILE_SERVER_URL_INVALID, INVALID_CONTENT_HASH, FAILED_TO_UPDATE_REQUEST, FAILED_TO_ADD_COMPLETED_DOWNLOAD, FETCH_FILE_SERVER_INVALID_RESPONSE, REQUEST_DOES_NOT_EXIST, ENQUEUE_NOT_SUCCESSFUL, COMPLETED_NOT_ADDED_SUCCESSFULLY, ENQUEUED_REQUESTS_ARE_NOT_DISTINCT, FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE, FAILED_TO_RENAME_FILE, FILE_ALLOCATION_FAILED, HTTP_CONNECTION_NOT_ALLOWED};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C4969v c4969v = null;
        NO_NETWORK_CONNECTION = new Error("NO_NETWORK_CONNECTION", 8, 7, 0 == true ? 1 : 0, null, 6, c4969v);
        FILE_NOT_FOUND = new Error("FILE_NOT_FOUND", 17, 17, 0 == true ? 1 : 0, null, 6, c4969v);
        int i10 = 19;
        FETCH_FILE_SERVER_URL_INVALID = new Error("FETCH_FILE_SERVER_URL_INVALID", 18, i10, null, null, 6, null);
        int i11 = 20;
        INVALID_CONTENT_HASH = new Error("INVALID_CONTENT_HASH", i10, i11, 0 == true ? 1 : 0, null, 6, null);
        int i12 = 21;
        FAILED_TO_UPDATE_REQUEST = new Error("FAILED_TO_UPDATE_REQUEST", i11, i12, 0 == true ? 1 : 0, null, 6, null);
        int i13 = 22;
        FAILED_TO_ADD_COMPLETED_DOWNLOAD = new Error("FAILED_TO_ADD_COMPLETED_DOWNLOAD", i12, i13, 0 == true ? 1 : 0, null, 6, null);
        int i14 = 23;
        FETCH_FILE_SERVER_INVALID_RESPONSE = new Error("FETCH_FILE_SERVER_INVALID_RESPONSE", i13, i14, 0 == true ? 1 : 0, null, 6, null);
        int i15 = 24;
        REQUEST_DOES_NOT_EXIST = new Error("REQUEST_DOES_NOT_EXIST", i14, i15, 0 == true ? 1 : 0, null, 6, 0 == true ? 1 : 0);
        int i16 = 25;
        ENQUEUE_NOT_SUCCESSFUL = new Error("ENQUEUE_NOT_SUCCESSFUL", i15, i16, 0 == true ? 1 : 0, null, 6, 0 == true ? 1 : 0);
        int i17 = 26;
        COMPLETED_NOT_ADDED_SUCCESSFULLY = new Error("COMPLETED_NOT_ADDED_SUCCESSFULLY", i16, i17, 0 == true ? 1 : 0, null, 6, null);
        ENQUEUED_REQUESTS_ARE_NOT_DISTINCT = new Error("ENQUEUED_REQUESTS_ARE_NOT_DISTINCT", i17, 27, 0 == true ? 1 : 0, null, 6, c4969v);
        int i18 = 28;
        FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE = new Error("FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE", 27, i18, null, null, 6, null);
        int i19 = 29;
        FAILED_TO_RENAME_FILE = new Error("FAILED_TO_RENAME_FILE", i18, i19, 0 == true ? 1 : 0, null, 6, null);
        int i20 = 30;
        FILE_ALLOCATION_FAILED = new Error("FILE_ALLOCATION_FAILED", i19, i20, 0 == true ? 1 : 0, null, 6, null);
        HTTP_CONNECTION_NOT_ALLOWED = new Error("HTTP_CONNECTION_NOT_ALLOWED", i20, 31, 0 == true ? 1 : 0, null, 6, null);
        Error[] errorArr$values = $values();
        $VALUES = errorArr$values;
        $ENTRIES = kotlin.enums.c.c(errorArr$values);
        Companion = new a();
    }

    private Error(String str, int i10, int i11, Throwable th, Downloader.a aVar) {
        this.value = i11;
        this.throwable = th;
        this.httpResponse = aVar;
    }

    @NotNull
    public static kotlin.enums.a<Error> getEntries() {
        return $ENTRIES;
    }

    @o
    @NotNull
    public static final Error valueOf(int i10) {
        return Companion.a(i10);
    }

    public static Error[] values() {
        return (Error[]) $VALUES.clone();
    }

    @Nullable
    public final Downloader.a getHttpResponse() {
        return this.httpResponse;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setHttpResponse(@Nullable Downloader.a aVar) {
        this.httpResponse = aVar;
    }

    public final void setThrowable(@Nullable Throwable th) {
        this.throwable = th;
    }

    public static Error valueOf(String str) {
        return (Error) Enum.valueOf(Error.class, str);
    }

    public /* synthetic */ Error(String str, int i10, int i11, Throwable th, Downloader.a aVar, int i12, C4969v c4969v) {
        this(str, i10, i11, (i12 & 2) != 0 ? null : th, (i12 & 4) != 0 ? null : aVar);
    }
}
