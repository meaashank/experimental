package com.prism.gaia.helper;

import C4.q;
import android.os.Build;
import android.os.Bundle;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.utils.C3921d;
import com.prism.gaia.helper.utils.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164943a = "asdf-".concat(a.class.getSimpleName());

    public static void a(List<String> list, String str, String str2) {
        list.add("--dex-file=" + str);
        list.add("--oat-file=" + str2);
    }

    public static boolean b(String str, String str2, String str3, boolean z10) throws IOException {
        List<String> listF = f();
        if (Build.VERSION.SDK_INT >= 24) {
            ArrayList arrayList = (ArrayList) listF;
            arrayList.add("--runtime-arg");
            arrayList.add("-classpath");
            arrayList.add("--runtime-arg");
            arrayList.add("&");
        }
        ArrayList arrayList2 = (ArrayList) listF;
        arrayList2.add("--instruction-set=" + NativeLibraryHelperCompat.l(str3));
        arrayList2.add("--runtime-arg");
        arrayList2.add("-Xrelocate");
        arrayList2.add("--boot-image=/system/framework/boot.art");
        arrayList2.add("-j4");
        arrayList2.add("--instruction-set-features=default");
        a(listF, str, str2);
        if (z10) {
            if (C3841e.s()) {
                arrayList2.add("--compiler-filter=quicken");
            } else {
                arrayList2.add("--compiler-filter=speed");
            }
        }
        return c(listF, str2);
    }

    public static boolean c(List<String> list, String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(q.f17581a);
        }
        C3921d.b bVarB = C3921d.b(list, true, true);
        if (bVarB.e()) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("CMD", sb2.toString());
        bundle.putString("STD_OUT", bVarB.f165116b);
        bundle.putString("ERR_OUT", bVarB.f165117c);
        bundle.putInt("RET", bVarB.f165115a);
        Throwable runtimeException = bVarB.f165118d;
        if (runtimeException == null) {
            runtimeException = new RuntimeException("dex2oat exec failed on NO EXCEPTION:");
        }
        C5705o.c().e(runtimeException, "com.app.hider.master.promax", "supervisor", "DEX2OAT_FAILED", bundle);
        if (!new File(str).exists()) {
            return false;
        }
        new File(str).delete();
        return false;
    }

    public static void d(String str, String str2, String str3) throws IOException {
        List<String> listF = f();
        a(listF, str, str2);
        ArrayList arrayList = (ArrayList) listF;
        arrayList.add("--instruction-set=" + NativeLibraryHelperCompat.l(str3));
        arrayList.add("--compiler-filter=verify-none");
        c(listF, str2);
    }

    public static void e(String str) throws IOException {
        l.e(str, 511);
        l.B(new File(str).getParent(), 493);
    }

    public static List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        return arrayList;
    }
}
