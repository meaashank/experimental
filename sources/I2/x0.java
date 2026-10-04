package I2;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51043a = "MOBILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51044b = "BRAND_VERSION_LIST";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51045c = "FULL_VERSION";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51046d = "PLATFORM";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51047e = "PLATFORM_VERSION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51048f = "ARCHITECTURE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51049g = "MODEL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51050h = "BITNESS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51051i = "WOW64";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f51052j = 3;

    @NonNull
    public static Map<String, Object> a(@NonNull UserAgentMetadata userAgentMetadata) {
        HashMap map = new HashMap();
        map.put(f51044b, b(userAgentMetadata.f120021a));
        map.put(f51045c, userAgentMetadata.f120022b);
        map.put(f51046d, userAgentMetadata.f120023c);
        map.put(f51047e, userAgentMetadata.f120024d);
        map.put(f51048f, userAgentMetadata.f120025e);
        map.put(f51049g, userAgentMetadata.f120026f);
        map.put(f51043a, Boolean.valueOf(userAgentMetadata.f120027g));
        map.put(f51050h, Integer.valueOf(userAgentMetadata.f120028h));
        map.put(f51051i, Boolean.valueOf(userAgentMetadata.f120029i));
        return map;
    }

    public static String[][] b(List<UserAgentMetadata.BrandVersion> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 3);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).f120030a;
            strArr[i10][1] = list.get(i10).f120031b;
            strArr[i10][2] = list.get(i10).f120032c;
        }
        return strArr;
    }

    @NonNull
    public static UserAgentMetadata c(@NonNull Map<String, Object> map) {
        UserAgentMetadata.Builder builder = new UserAgentMetadata.Builder();
        Object obj = map.get(f51044b);
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : (String[][]) obj) {
                arrayList.add(new UserAgentMetadata.BrandVersion.Builder().setBrand(strArr[0]).setMajorVersion(strArr[1]).setFullVersion(strArr[2]).build());
            }
            builder.setBrandVersionList(arrayList);
        }
        String str = (String) map.get(f51045c);
        if (str != null) {
            builder.setFullVersion(str);
        }
        String str2 = (String) map.get(f51046d);
        if (str2 != null) {
            builder.setPlatform(str2);
        }
        String str3 = (String) map.get(f51047e);
        if (str3 != null) {
            builder.setPlatformVersion(str3);
        }
        String str4 = (String) map.get(f51048f);
        if (str4 != null) {
            builder.setArchitecture(str4);
        }
        String str5 = (String) map.get(f51049g);
        if (str5 != null) {
            builder.setModel(str5);
        }
        Boolean bool = (Boolean) map.get(f51043a);
        if (bool != null) {
            builder.setMobile(bool.booleanValue());
        }
        Integer num = (Integer) map.get(f51050h);
        if (num != null) {
            builder.setBitness(num.intValue());
        }
        Boolean bool2 = (Boolean) map.get(f51051i);
        if (bool2 != null) {
            builder.setWow64(bool2.booleanValue());
        }
        return builder.build();
    }
}
