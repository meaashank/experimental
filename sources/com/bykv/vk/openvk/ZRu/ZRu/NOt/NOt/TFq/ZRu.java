package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;

import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import java.io.InputStream;
import java.util.List;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    TFq NOt;
    List<Vor.NOt> ZRu;

    public abstract String Ht();

    public TFq Mm() {
        return this.NOt;
    }

    public abstract boolean NOt();

    public abstract String TFq();

    public abstract int ZRu();

    public Vor.NOt ZRu(String str) {
        List<Vor.NOt> list;
        if (str != null && (list = this.ZRu) != null && list.size() > 0) {
            for (Vor.NOt nOt : this.ZRu) {
                if (str.equals(nOt.ZRu)) {
                    return nOt;
                }
            }
        }
        return null;
    }

    public abstract String ZRu(String str, String str2);

    public abstract List<Vor.NOt> mZ();

    public abstract InputStream uR();

    public String ZRu(int i10) {
        switch (i10) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case HttpStatus.SC_RESET_CONTENT /* 205 */:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i10) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i10) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case 413:
                                return "Request Entity Too Large";
                            case 414:
                                return "Request-URI Too Large";
                            case 415:
                                return "Unsupported Media Type";
                            default:
                                switch (i10) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }
}
