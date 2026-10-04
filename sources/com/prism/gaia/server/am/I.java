package com.prism.gaia.server.am;

import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.server.pm.PackageG;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166727c = "asdf-".concat(I.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Integer> f166728a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166729b = 10000;

    public int a(PackageG packageG) {
        String str = packageG.f167515r;
        if (str == null) {
            str = packageG.f167512o;
        }
        synchronized (this.f166728a) {
            try {
                Integer num = this.f166728a.get(str);
                if (num != null) {
                    return num.intValue();
                }
                int i10 = this.f166729b + 1;
                this.f166729b = i10;
                this.f166728a.put(str, Integer.valueOf(i10));
                d();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        this.f166728a.clear();
        if (c(D9.d.Z())) {
            return;
        }
        c(D9.d.a0());
    }

    public final boolean c(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            this.f166729b = objectInputStream.readInt();
            this.f166728a.putAll((HashMap) objectInputStream.readObject());
            objectInputStream.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void d() throws Throwable {
        GFile gFileZ = D9.d.Z();
        GFile gFileA0 = D9.d.a0();
        if (gFileZ.exists()) {
            if (gFileA0.exists() && !gFileA0.delete()) {
                gFileA0.getPath();
            }
            try {
                com.prism.gaia.helper.utils.l.o(gFileZ, gFileA0, null);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(gFileZ));
            objectOutputStream.writeInt(this.f166729b);
            objectOutputStream.writeObject(this.f166728a);
            objectOutputStream.close();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
