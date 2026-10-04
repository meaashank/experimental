package com.prism.hider.download;

import T9.e;
import android.content.Context;
import androidx.core.content.FileProvider;
import com.prism.commons.utils.C3861z;

/* JADX INFO: loaded from: classes6.dex */
public class FileBridgeProvider extends FileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167770a = ".file.bridge.provider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3861z<String, Context> f167771b = new C3861z<>(new e());

    public static /* synthetic */ String a(Context context) {
        return context.getPackageName() + f167770a;
    }

    public static String b(Context context) {
        return f167771b.a(context);
    }
}
