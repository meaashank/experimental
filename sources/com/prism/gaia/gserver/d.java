package com.prism.gaia.gserver;

import android.os.Environment;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164888b = "asdf-".concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f164889c = NativeLibraryHelperCompat.f164958k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, File> f164890a = new HashMap();

    public static d b(File file) {
        d dVar = new d();
        try {
            String strSubstring = file.getCanonicalPath().replace(RemoteSettings.FORWARD_SLASH_STRING, "@").substring(1);
            LinkedList linkedList = new LinkedList();
            linkedList.add(strSubstring + "@classes.dex");
            if (C3841e.s()) {
                linkedList.add(strSubstring + "@classes.odex");
            }
            String name = file.getName();
            int i10 = 0;
            if (name.endsWith(".apk") || name.endsWith(".jar")) {
                name = name.substring(0, name.length() - 4);
            }
            String canonicalPath = file.getParentFile().getCanonicalPath();
            String str = Environment.getDataDirectory() + "/dalvik-cache";
            if (new File(canonicalPath + "/oat").exists()) {
                for (String str2 : f164889c) {
                    dVar.a(str2, new File(canonicalPath + "/oat/" + str2 + RemoteSettings.FORWARD_SLASH_STRING + name + ".odex"));
                }
            } else {
                dVar.a(U6.c.q(), new File(canonicalPath + RemoteSettings.FORWARD_SLASH_STRING + name + ".odex"));
                String[] strArr = f164889c;
                int length = strArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    String str3 = strArr[i11];
                    dVar.a(str3, new File(canonicalPath + RemoteSettings.FORWARD_SLASH_STRING + str3 + RemoteSettings.FORWARD_SLASH_STRING + name + ".odex"));
                }
            }
            if (new File(str).exists()) {
                if (new File(str + "/oat").exists()) {
                    String[] strArr2 = f164889c;
                    int length2 = strArr2.length;
                    while (i10 < length2) {
                        String str4 = strArr2[i10];
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            dVar.a(str4, new File(str + "/oat/" + str4 + RemoteSettings.FORWARD_SLASH_STRING + ((String) it.next())));
                        }
                        i10++;
                    }
                } else {
                    String[] strArr3 = f164889c;
                    int length3 = strArr3.length;
                    while (i10 < length3) {
                        String str5 = strArr3[i10];
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            dVar.a(str5, new File(str + RemoteSettings.FORWARD_SLASH_STRING + str5 + RemoteSettings.FORWARD_SLASH_STRING + ((String) it2.next())));
                        }
                        i10++;
                    }
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        dVar.a(U6.c.q(), new File(str + RemoteSettings.FORWARD_SLASH_STRING + ((String) it3.next())));
                    }
                }
            }
            return dVar;
        } catch (Exception e10) {
            e10.getMessage();
            return dVar;
        }
    }

    public final void a(String str, File file) {
        if (file.exists()) {
            if (!C3841e.w() && !file.canRead()) {
                file.getAbsolutePath();
                return;
            }
            File file2 = this.f164890a.get(str);
            if (file2 == null) {
                file.getAbsolutePath();
                this.f164890a.put(str, file);
            } else if (file.lastModified() > file2.lastModified()) {
                file2.getAbsolutePath();
                file.getAbsolutePath();
                this.f164890a.put(str, file);
            }
        }
    }

    public File c() {
        for (String str : f164889c) {
            File fileD = d(str);
            if (fileD != null) {
                return fileD;
            }
        }
        return null;
    }

    public File d(String str) {
        return this.f164890a.get(str);
    }

    public boolean e() {
        return this.f164890a.size() > 0;
    }

    public boolean f(String str) {
        return this.f164890a.containsKey(NativeLibraryHelperCompat.l(str));
    }

    public boolean g(String str) {
        return this.f164890a.containsKey(str);
    }
}
