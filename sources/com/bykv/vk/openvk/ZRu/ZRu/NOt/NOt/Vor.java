package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.prism.gaia.download.a;
import com.prism.gaia.server.accounts.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Vor {
    public final List<NOt> NOt;
    public final mZ ZRu;
    public final ZRu mZ;

    public static final class NOt {
        public final String NOt;
        public final String ZRu;

        public NOt(String str, String str2) {
            this.ZRu = str;
            this.NOt = str2;
        }

        public static NOt ZRu(String str) throws uR {
            int iIndexOf = str.indexOf(b.f166434b0);
            if (iIndexOf == -1) {
                throw new uR("request header format error, header: ".concat(str));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            String strTrim2 = str.substring(iIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0) {
                throw new uR("request header format error, header: ".concat(str));
            }
            return new NOt(strTrim, strTrim2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Header{name='");
            sb2.append(this.ZRu);
            sb2.append("', value='");
            return e.a(sb2, this.NOt, "'}");
        }
    }

    public static final class ZRu {
        final String Ht;
        final List<String> Mm;
        final String NOt;
        final int TFq;
        final int ZRu;
        final String mZ;
        final int uR;

        private ZRu(int i10, String str, String str2, int i11, int i12, String str3, List<String> list) {
            this.ZRu = i10;
            this.NOt = str;
            this.mZ = str2;
            this.uR = i11;
            this.TFq = i12;
            this.Ht = str3;
            this.Mm = list;
        }

        public static ZRu ZRu(mZ mZVar, List<NOt> list) throws uR {
            String str;
            int i10;
            int i11;
            int iIndexOf = mZVar.NOt.indexOf("?");
            if (iIndexOf == -1) {
                throw new uR("path format error, path: " + mZVar.NOt);
            }
            ArrayList arrayList = new ArrayList();
            String strDecode = null;
            String str2 = null;
            int i12 = 0;
            String strDecode2 = null;
            for (String str3 : mZVar.NOt.substring(iIndexOf + 1).split("&")) {
                String[] strArrSplit = str3.split("=");
                if (strArrSplit.length == 2) {
                    if ("rk".equals(strArrSplit[0])) {
                        strDecode = Uri.decode(strArrSplit[1]);
                    } else if ("k".equals(strArrSplit[0])) {
                        strDecode2 = Uri.decode(strArrSplit[1]);
                    } else if (strArrSplit[0].startsWith("u")) {
                        arrayList.add(Uri.decode(strArrSplit[1]));
                    } else if ("f".equals(strArrSplit[0]) && com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.NOt(strArrSplit[1]) == 1) {
                        i12 = 1;
                    }
                }
            }
            if (TextUtils.isEmpty(strDecode) || TextUtils.isEmpty(strDecode2)) {
                throw new uR("rawKey or key is empty, path: " + mZVar.NOt);
            }
            if (list != null) {
                int i13 = 0;
                int i14 = 0;
                for (NOt nOt : list) {
                    if (nOt != null && "Range".equalsIgnoreCase(nOt.ZRu)) {
                        int iIndexOf2 = nOt.NOt.indexOf("=");
                        if (iIndexOf2 == -1) {
                            throw new uR("Range format error, Range: " + nOt.NOt);
                        }
                        if (!"bytes".equalsIgnoreCase(nOt.NOt.substring(0, iIndexOf2).trim())) {
                            throw new uR("Range format error, Range: " + nOt.NOt);
                        }
                        String strSubstring = nOt.NOt.substring(iIndexOf2 + 1);
                        if (strSubstring.contains(",")) {
                            throw new uR("Range format error, Range: " + nOt.NOt);
                        }
                        int iIndexOf3 = strSubstring.indexOf(a.f164606q);
                        if (iIndexOf3 == -1) {
                            throw new uR("Range format error, Range: " + nOt.NOt);
                        }
                        String strTrim = strSubstring.substring(0, iIndexOf3).trim();
                        String strTrim2 = strSubstring.substring(iIndexOf3 + 1).trim();
                        try {
                            if (strTrim.length() > 0) {
                                i13 = Integer.parseInt(strTrim);
                            }
                            if (strTrim2.length() > 0 && i13 > (i14 = Integer.parseInt(strTrim2))) {
                                throw new uR("Range format error, Range: " + nOt.NOt);
                            }
                            str2 = nOt.NOt;
                        } catch (NumberFormatException unused) {
                            throw new uR("Range format error, Range: " + nOt.NOt);
                        }
                    }
                }
                i10 = i13;
                str = str2;
                i11 = i14;
            } else {
                str = null;
                i10 = 0;
                i11 = 0;
            }
            if (!arrayList.isEmpty()) {
                return new ZRu(i12, strDecode, strDecode2, i10, i11, str, arrayList);
            }
            throw new uR("no url found: path: " + mZVar.NOt);
        }

        public String toString() {
            return "Extra{flag=" + this.ZRu + ", rawKey='" + this.NOt + "', key='" + this.mZ + "', from=" + this.uR + ", to=" + this.TFq + ", urls=" + this.Mm + '}';
        }
    }

    public static final class mZ {
        final String NOt;
        final String ZRu;
        final String mZ;

        private mZ(String str, String str2, String str3) {
            this.ZRu = str;
            this.NOt = str2;
            this.mZ = str3;
        }

        public static mZ ZRu(String str) throws uR {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw new uR("request line format error, line: ".concat(str));
            }
            int iLastIndexOf = str.lastIndexOf(32);
            if (iLastIndexOf <= iIndexOf) {
                throw new uR("request line format error, line: ".concat(str));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            String strTrim2 = str.substring(iIndexOf + 1, iLastIndexOf).trim();
            String strTrim3 = str.substring(iLastIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0 || strTrim3.length() == 0) {
                throw new uR("request line format error, line: ".concat(str));
            }
            return new mZ(strTrim, strTrim2, strTrim3);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequestLine{method='");
            sb2.append(this.ZRu);
            sb2.append("', path='");
            sb2.append(this.NOt);
            sb2.append("', version='");
            return e.a(sb2, this.mZ, "'}");
        }
    }

    public static final class uR extends Exception {
        public uR(String str) {
            super(str);
        }
    }

    public Vor(mZ mZVar, List<NOt> list, ZRu zRu) {
        this.ZRu = mZVar;
        this.NOt = list;
        this.mZ = zRu;
    }

    public static Vor ZRu(InputStream inputStream) throws IOException, uR {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu));
        ArrayList arrayList = new ArrayList();
        mZ mZVarZRu = null;
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                break;
            }
            String strTrim = line.trim();
            if (mZVarZRu == null) {
                mZVarZRu = mZ.ZRu(strTrim);
            } else {
                arrayList.add(NOt.ZRu(strTrim));
            }
        }
        if (mZVarZRu != null) {
            return new Vor(mZVarZRu, arrayList, ZRu.ZRu(mZVarZRu, arrayList));
        }
        throw new uR("request line is null");
    }

    public String toString() {
        return "Request{requestLine=" + this.ZRu + ", headers=" + this.NOt + ", extra=" + this.mZ + '}';
    }

    public static String ZRu(String str, String str2, List<String> list) {
        StringBuilder sb2 = new StringBuilder(512);
        String strZRu = null;
        do {
            if (strZRu != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            strZRu = ZRu(sb2, str, str2, list);
        } while (strZRu.length() > 3072);
        return strZRu;
    }

    private static String ZRu(StringBuilder sb2, String str, String str2, List<String> list) {
        sb2.delete(0, sb2.length());
        sb2.append("rk=");
        sb2.append(Uri.encode(str));
        sb2.append("&k=");
        sb2.append(Uri.encode(str2));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("&u");
            sb2.append(i10);
            sb2.append("=");
            sb2.append(Uri.encode(list.get(i10)));
        }
        return sb2.toString();
    }
}
