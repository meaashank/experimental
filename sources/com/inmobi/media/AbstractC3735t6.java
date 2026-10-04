package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.text.C5013e;

/* JADX INFO: renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3735t6 {
    public static final boolean a(String tag, String data, String filePath) {
        kotlin.jvm.internal.G.p(tag, "tag");
        kotlin.jvm.internal.G.p(data, "data");
        kotlin.jvm.internal.G.p(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(C5013e.f218326b);
            kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final void a(String filePath) {
        kotlin.jvm.internal.G.p(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
