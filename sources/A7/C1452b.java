package a7;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: a7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C1452b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f84754a = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.google.android.gms", "com.google.android.gsf", "com.android.vending", "com.google.android.googlequicksearchbox", "com.google.android.play.games", "com.facebook.appmanager", "com.facebook.services", "com.facebook.system")));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f84755b = Collections.EMPTY_SET;

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && f84755b.contains(str);
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && f84754a.contains(str);
    }
}
