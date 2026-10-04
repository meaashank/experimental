package com.prism.gaia.helper.utils;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.multidex.MultiDexExtractor;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.exception.DiskNoSpaceException;
import com.prism.gaia.exception.GaiaRemoteRunnableException;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class OatUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165061a = "asdf-".concat(OatUtils.class.getSimpleName());

    public static class GenOat extends RemoteRunnable {
        public static final Parcelable.Creator<GenOat> CREATOR = new a();
        private String abi;
        private File dexFile;
        private String oatFilePath;

        public class a implements Parcelable.Creator<GenOat> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public GenOat createFromParcel(Parcel parcel) {
                return new GenOat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public GenOat[] newArray(int i10) {
                return new GenOat[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void genOat(File file, String str, String str2, GUri gUri) throws IOException {
            GenOat genOat = new GenOat();
            genOat.dexFile = file;
            genOat.oatFilePath = str;
            genOat.abi = str2;
            try {
                genOat.start(gUri);
            } catch (GaiaRemoteRunnableException e10) {
                if (!(e10.getCause() instanceof IOException)) {
                    throw e10;
                }
                throw ((IOException) e10.getCause());
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            OatUtils.e(this.dexFile, this.oatFilePath, this.abi);
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            l.S(parcel, this.dexFile);
            parcel.writeString(this.oatFilePath);
            parcel.writeString(this.abi);
        }

        private GenOat() {
        }

        private GenOat(Parcel parcel) {
            super(parcel);
            this.dexFile = l.R(parcel);
            this.oatFilePath = parcel.readString();
            this.abi = parcel.readString();
        }
    }

    public static Set<String> a(File file, String str, String str2) {
        HashSet hashSet = new HashSet();
        String name = file.getName();
        hashSet.add(D9.d.g().h("com.app.hider.master.promax") + "/data@app@" + str + "-1@" + name + "@classes.dex");
        hashSet.add(D9.d.f23000l.h("com.app.hider.helper.hider32helper") + "/data@app@" + str + "-1@" + name + "@classes.dex");
        hashSet.add(D9.d.f23000l.h("com.app.hider.helper.hider64helper") + "/data@app@" + str + "-1@" + name + "@classes.dex");
        return hashSet;
    }

    public static String b(File file, String str, String str2) {
        String name = file.getName();
        String strSubstring = name.substring(0, name.lastIndexOf(46));
        File parentFile = file.getParentFile();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(parentFile.getAbsolutePath());
        sb2.append("/oat/");
        sb2.append(NativeLibraryHelperCompat.l(str2));
        sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
        return android.support.v4.media.e.a(sb2, strSubstring, ".odex");
    }

    public static void c(File file, String str, String str2) throws IOException {
        if (file.getName().endsWith(MultiDexExtractor.f114845k)) {
            com.prism.gaia.helper.a.d(file.getAbsolutePath(), str, str2);
        } else {
            if (com.prism.gaia.helper.a.b(file.getAbsolutePath(), str, str2, true)) {
                return;
            }
            if (!com.prism.gaia.helper.a.b(file.getAbsolutePath(), str, str2, false)) {
                throw new IOException("dex2oat failed");
            }
        }
        com.prism.gaia.helper.a.e(str);
    }

    public static boolean d(String str, File file) throws DiskNoSpaceException {
        File file2;
        if (Build.VERSION.SDK_INT >= 26) {
            String str2 = file.getParentFile().getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING + file.getName().replace(".odex", ".vdex");
            file2 = new File(str2);
            if (!file2.exists()) {
                throw new RuntimeException(w.y.a("genDexExtZip found no vdex-file: ", str2));
            }
        } else {
            file2 = file;
        }
        file2.getAbsolutePath();
        List<byte[]> listE = g.e(file2);
        if (((LinkedList) listE).size() <= 0) {
            file2.getAbsolutePath();
            throw new RuntimeException("genDexExtZip extract none dex, srcFile=" + file2.getAbsolutePath());
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
            int i10 = 1;
            for (byte[] bArr : listE) {
                String str3 = MultiDexExtractor.f114842h;
                if (i10 > 1) {
                    str3 = MultiDexExtractor.f114842h + String.valueOf(i10);
                }
                zipOutputStream.putNextEntry(new ZipEntry(str3 + MultiDexExtractor.f114843i));
                zipOutputStream.write(bArr);
                i10++;
            }
            zipOutputStream.close();
            return true;
        } catch (IOException e10) {
            if (l.d(e10)) {
                throw new DiskNoSpaceException(e10);
            }
            file.getAbsolutePath();
            e10.getMessage();
            StringBuilder sbA = androidx.activity.result.i.a("generate zip(", str, ") for oat-file(");
            sbA.append(file.getAbsolutePath());
            sbA.append(") failed: ");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public static void e(File file, String str, String str2) throws IOException {
        l.x(str);
        c(file, str, str2);
        file.getAbsolutePath();
    }

    public static void f(File file, String str, String str2, GUri gUri) throws IOException {
        GenOat.genOat(file, str, str2, gUri);
    }

    public static boolean g(File file) {
        return l.c(file, 0, 2135247942L);
    }

    public static boolean h(File file) {
        return l.c(file, 4096, 1868657674L);
    }
}
