package tb;

import android.text.TextUtils;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpRequest;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.text.X;
import org.apache.http.protocol.HTTP;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
public class e implements l {
    private Map<String, List<String>> headerPairs;
    private String signTime;
    private final List<String> needToSignHeaders = Arrays.asList("cache-control", "content-disposition", "content-encoding", "content-length", "content-md5", "content-type", "expect", "expires", Hd.d.f50815k, "if-match", "if-modified-since", "if-none-match", "if-unmodified-since", "origin", "range", "transfer-encoding");
    private Set<String> headerKeysRequiredToSign = new HashSet();
    private Set<String> parametersRequiredToSign = new HashSet();
    private Set<String> headerKeysSigned = new HashSet();
    private Set<String> parametersSigned = new HashSet();

    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class b implements Comparator<String> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public final String a(Map<String, List<String>> map, Set<String> set, Set<String> set2) {
        StringBuilder sb2 = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(yb.d.h(it.next()).toLowerCase(Locale.ROOT));
        }
        Collections.sort(linkedList, new b());
        Set<String> setKeySet = map.keySet();
        HashMap map2 = new HashMap();
        for (String str : setKeySet) {
            map2.put(str.toLowerCase(Locale.ROOT), str);
        }
        boolean z10 = true;
        for (String str2 : linkedList) {
            List<String> list = map.get(map2.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z10) {
                        sb2.append(X.f218302d);
                    }
                    Locale locale = Locale.ROOT;
                    set2.add(str2.toLowerCase(locale));
                    sb2.append(str2.toLowerCase(locale));
                    sb2.append(SignatureVisitor.INSTANCEOF);
                    if (!TextUtils.isEmpty(str3)) {
                        sb2.append(yb.d.h(str3));
                    }
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    public final String b(URL url, Set<String> set, Set<String> set2) {
        StringBuilder sb2 = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().toLowerCase(Locale.ROOT));
        }
        Collections.sort(linkedList, new a());
        LinkedHashMap linkedHashMap = (LinkedHashMap) yb.d.a(url);
        Set<String> setKeySet = linkedHashMap.keySet();
        HashMap map = new HashMap();
        for (String str : setKeySet) {
            map.put(str.toLowerCase(Locale.ROOT), str);
        }
        boolean z10 = true;
        for (String str2 : linkedList) {
            List<String> list = (List) linkedHashMap.get(map.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z10) {
                        sb2.append(X.f218302d);
                    }
                    Locale locale = Locale.ROOT;
                    set2.add(str2.toLowerCase(locale));
                    sb2.append(str2.toLowerCase(locale));
                    sb2.append(SignatureVisitor.INSTANCEOF);
                    if (!TextUtils.isEmpty(str3)) {
                        sb2.append(yb.d.h(str3));
                    }
                    z10 = false;
                }
            }
        }
        return sb2.toString();
    }

    public final String c(Set<String> set) {
        if (set == null) {
            return "";
        }
        TreeSet<String> treeSet = new TreeSet(set);
        StringBuilder sb2 = new StringBuilder();
        for (String str : treeSet) {
            if (!yb.e.d(sb2.toString())) {
                sb2.append(";");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final Set<String> d(Set<String> set) {
        if (set == null || set.size() <= 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        return hashSet;
    }

    public String getRealHeaderList() {
        return c(this.headerKeysSigned);
    }

    public String getRealParameterList() {
        return c(this.parametersSigned);
    }

    public void header(String str) {
        this.headerKeysRequiredToSign.add(str);
    }

    public void headers(Set<String> set) {
        if (set != null) {
            this.headerKeysRequiredToSign.addAll(set);
        }
    }

    public void parameter(String str) {
        this.parametersRequiredToSign.add(str);
    }

    public void parameters(Set<String> set) {
        if (set != null) {
            this.parametersRequiredToSign.addAll(set);
        }
    }

    public void setHeaderPairsForSign(Map<String, List<String>> map) {
        this.headerPairs = map;
    }

    public void setSignTime(String str) {
        this.signTime = str;
    }

    @Override // tb.l
    public <T> String source(HttpRequest<T> httpRequest) throws QCloudClientException {
        String strH;
        if (httpRequest == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("Content-Type");
        hashSet.add("Content-Length");
        for (String str : httpRequest.q().keySet()) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (this.needToSignHeaders.contains(lowerCase) || lowerCase.startsWith(Headers.COS_PREFIX)) {
                hashSet.add(str);
            }
        }
        if (httpRequest.j() != null) {
            Iterator<String> it = httpRequest.j().iterator();
            while (it.hasNext()) {
                hashSet.remove(it.next());
            }
        }
        if (this.headerKeysRequiredToSign.size() < 1) {
            this.headerKeysRequiredToSign.addAll(hashSet);
        }
        if (this.parametersRequiredToSign.size() < 1) {
            Map<String, List<String>> mapB = yb.d.b(httpRequest.A());
            Iterator<String> it2 = httpRequest.j().iterator();
            while (it2.hasNext()) {
                mapB.remove(yb.d.g(it2.next()));
            }
            this.parametersRequiredToSign.addAll(((LinkedHashMap) mapB).keySet());
        }
        if (this.headerKeysRequiredToSign.size() > 0) {
            Set<String> setD = d(this.headerKeysRequiredToSign);
            if (setD != null) {
                if (((HashSet) setD).contains("Content-Type".toLowerCase(Locale.ROOT)) && httpRequest.n() != null && !httpRequest.q().containsKey("Content-Type") && (strH = httpRequest.h()) != null) {
                    httpRequest.b("Content-Type", strH);
                }
            }
            if (setD != null) {
                if (((HashSet) setD).contains("Content-Length".toLowerCase(Locale.ROOT)) && httpRequest.n() != null) {
                    try {
                        long jG = httpRequest.g();
                        if (jG != -1) {
                            httpRequest.b("Content-Length", Long.toString(jG));
                            httpRequest.u("Transfer-Encoding");
                        } else {
                            httpRequest.b("Transfer-Encoding", HTTP.CHUNK_CODING);
                            httpRequest.u("Content-Length");
                        }
                    } catch (IOException e10) {
                        throw new QCloudClientException("read content length fails", e10);
                    }
                }
            }
            if (setD != null) {
                if (((HashSet) setD).contains("Date".toLowerCase(Locale.ROOT))) {
                    httpRequest.b("Date", com.tencent.qcloud.core.http.e.e(new Date()));
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(httpRequest.s().toLowerCase(Locale.ROOT));
        sb2.append("\n");
        sb2.append(yb.d.g(httpRequest.A().getPath()));
        sb2.append("\n");
        sb2.append(b(httpRequest.A(), this.parametersRequiredToSign, this.parametersSigned));
        sb2.append("\n");
        Map<String, List<String>> mapQ = this.headerPairs;
        if (mapQ == null) {
            mapQ = httpRequest.q();
        }
        this.headerPairs = mapQ;
        sb2.append(mapQ != null ? a(mapQ, this.headerKeysRequiredToSign, this.headerKeysSigned) : "");
        sb2.append("\n");
        return "sha1\n" + this.signTime + "\n" + u.f(u.k(sb2.toString())) + "\n";
    }

    @Override // tb.l
    public <T> void onSignRequestSuccess(HttpRequest<T> httpRequest, h hVar, String str) {
    }
}
