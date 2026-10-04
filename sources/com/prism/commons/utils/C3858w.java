package com.prism.commons.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C1498d;
import androidx.core.content.FileProvider;
import androidx.multidex.MultiDexExtractor;
import c6.C2947b;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import com.google.common.base.Ascii;
import com.prism.commons.file.FileType;
import com.prism.commons.interfaces.WalkCmd;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.C5017i;
import l6.C5150b;

/* JADX INFO: renamed from: com.prism.commons.utils.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3858w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f162159b = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162158a = l0.b(C3858w.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f162160c = C5017i.f218346b.toCharArray();

    /* JADX INFO: renamed from: com.prism.commons.utils.w$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, FileType> f162161a;

        static {
            HashMap map = new HashMap(128);
            f162161a = map;
            FileType fileType = FileType.VIDEO;
            map.put(".3gp", fileType);
            map.put(".apk", FileType.APK);
            map.put(".asf", fileType);
            map.put(".avi", fileType);
            FileType fileType2 = FileType.OTHER;
            map.put(com.prism.gaia.download.a.f164605p, fileType2);
            FileType fileType3 = FileType.IMAGE;
            map.put(".bmp", fileType3);
            FileType fileType4 = FileType.TEXT;
            map.put(".c", fileType4);
            map.put(".class", fileType2);
            map.put(".conf", fileType4);
            map.put(".cpp", fileType4);
            map.put(".doc", FileType.DOC);
            map.put(".exe", fileType2);
            map.put(".f4v", fileType);
            map.put(".flv", fileType);
            map.put(".gif", fileType3);
            map.put(".gtar", fileType2);
            map.put(".gz", fileType2);
            map.put(".h", fileType4);
            map.put(".htm", fileType4);
            map.put(com.prism.gaia.download.a.f164603n, fileType4);
            map.put(".jar", fileType2);
            map.put(".java", fileType4);
            map.put(".jpeg", fileType3);
            map.put(".jpg", fileType3);
            map.put(".js", fileType2);
            map.put(".log", fileType4);
            FileType fileType5 = FileType.AUDIO;
            map.put(".m3u", fileType5);
            map.put(".m4a", fileType5);
            map.put(".m4b", fileType5);
            map.put(".m4p", fileType5);
            map.put(".m4u", fileType);
            map.put(".m4v", fileType);
            map.put(".mov", fileType);
            map.put(".mp2", fileType5);
            map.put(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION, fileType5);
            map.put(".mp4", fileType);
            map.put(".mpc", fileType2);
            map.put(".mpe", fileType);
            map.put(".mpeg", fileType);
            map.put(".mpg", fileType);
            map.put(".mpg4", fileType);
            map.put(".mpga", fileType5);
            map.put(".msg", fileType2);
            map.put(".ogg", fileType5);
            map.put(".pdf", FileType.PDF);
            map.put(u.e.f239314f, fileType3);
            FileType fileType6 = FileType.PPT;
            map.put(".pps", fileType6);
            map.put(".ppt", fileType6);
            map.put(".prop", fileType4);
            map.put(".rar", fileType2);
            map.put(".rc", fileType4);
            map.put(".rmvb", fileType5);
            map.put(".rtf", fileType2);
            map.put(".sh", fileType4);
            map.put(".tar", fileType2);
            map.put(".tgz", fileType2);
            map.put(com.prism.gaia.download.a.f164604o, fileType4);
            map.put(".wav", fileType5);
            map.put(".weba", fileType5);
            map.put(".webm", fileType);
            map.put(".webp", fileType3);
            map.put(".wma", fileType5);
            map.put(".wmv", fileType5);
            map.put(".wps", fileType2);
            map.put(C1498d.f86308y, fileType4);
            map.put(".z", fileType2);
            map.put(MultiDexExtractor.f114845k, fileType2);
            map.put("", FileType.UNKNOWN);
        }
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.w$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map<String, String> f162162a;

        static {
            HashMap map = new HashMap(128);
            f162162a = map;
            map.put(".3gp", "video/3gpp");
            map.put(".apk", c.f162163a);
            map.put(".asf", "video/x-ms-asf");
            map.put(".avi", "video/x-msvideo");
            map.put(com.prism.gaia.download.a.f164605p, "application/octet-stream");
            map.put(".bmp", "image/bmp");
            map.put(".c", "text/plain");
            map.put(".class", "application/octet-stream");
            map.put(".conf", "text/plain");
            map.put(".cpp", "text/plain");
            map.put(".doc", "application/msword");
            map.put(".exe", "application/octet-stream");
            map.put(".f4v", "video/x-f4v");
            map.put(".flv", "video/x-flv");
            map.put(".gif", "image/gif");
            map.put(".gtar", "application/x-gtar");
            map.put(".gz", "application/x-gzip");
            map.put(".h", "text/plain");
            map.put(".htm", "text/html");
            map.put(com.prism.gaia.download.a.f164603n, "text/html");
            map.put(".jar", "application/java-archive");
            map.put(".java", "text/plain");
            map.put(".jpeg", "image/jpeg");
            map.put(".jpg", "image/jpeg");
            map.put(".js", "application/x-javascript");
            map.put(".log", "text/plain");
            map.put(".m3u", "audio/x-mpegurl");
            map.put(".m4a", "audio/mp4a-latm");
            map.put(".m4b", "audio/mp4a-latm");
            map.put(".m4p", "audio/mp4a-latm");
            map.put(".m4u", "video/vnd.mpegurl");
            map.put(".m4v", "video/x-m4v");
            map.put(".mov", "video/quicktime");
            map.put(".mp2", "audio/x-mpeg");
            map.put(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION, "audio/x-mpeg");
            map.put(".mp4", "video/mp4");
            map.put(".mpc", "application/vnd.mpohun.certificate");
            map.put(".mpe", "video/mpeg");
            map.put(".mpeg", "video/mpeg");
            map.put(".mpg", "video/mpeg");
            map.put(".mpg4", "video/mp4");
            map.put(".mpga", "audio/mpeg");
            map.put(".msg", "application/vnd.ms-outlook");
            map.put(".ogg", "audio/ogg");
            map.put(".pdf", "application/pdf");
            map.put(u.e.f239314f, "image/png");
            map.put(".pps", "application/vnd.ms-powerpoint");
            map.put(".ppt", "application/vnd.ms-powerpoint");
            map.put(".prop", "text/plain");
            map.put(".rar", "application/x-rar-compressed");
            map.put(".rc", "text/plain");
            map.put(".rmvb", "audio/x-pn-realaudio");
            map.put(".rtf", "application/rtf");
            map.put(".sh", "text/plain");
            map.put(".tar", "application/x-tar");
            map.put(".tgz", "application/x-compressed");
            map.put(com.prism.gaia.download.a.f164604o, "text/plain");
            map.put(".wav", "audio/x-wav");
            map.put(".weba", "audio/weba");
            map.put(".webm", "video/webm");
            map.put(".webp", "image/webp");
            map.put(".wma", "audio/x-ms-wma");
            map.put(".wmv", "audio/x-ms-wmv");
            map.put(".wps", "application/vnd.ms-works");
            map.put(C1498d.f86308y, "text/plain");
            map.put(".z", "application/x-compress");
            map.put(MultiDexExtractor.f114845k, "application/zip");
            map.put("", "*/*");
        }
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.w$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f162163a = "application/vnd.android.package-archive";
    }

    public static Intent A(Context context, String str, File... fileArr) {
        return B(str, q(fileArr[0].getAbsolutePath()), C(context, str, fileArr));
    }

    public static Intent B(String str, String str2, ArrayList<Uri> arrayList) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setFlags(268435456);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.setType(str2);
        return intent;
    }

    public static ArrayList<Uri> C(Context context, String str, File... fileArr) {
        ArrayList<Uri> arrayList = new ArrayList<>(fileArr.length);
        for (File file : fileArr) {
            arrayList.add(w(context, str, file));
        }
        return arrayList;
    }

    public static InputStream D(ContentResolver contentResolver, Uri uri) throws IOException {
        return contentResolver.openInputStream(uri);
    }

    public static InputStream E(File file) throws IOException {
        return new FileInputStream(file);
    }

    public static boolean F(String str) {
        return y(str) == FileType.AUDIO;
    }

    public static boolean G(File file) {
        return file != null && H(file.getPath());
    }

    public static boolean H(String str) {
        return y(str) == FileType.IMAGE;
    }

    public static boolean I(String str) {
        return y(str) == FileType.VIDEO;
    }

    public static void J(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("mkdirs failed is exist and is not a directory dir: " + file.getAbsolutePath());
        }
        try {
            file.mkdirs();
        } catch (SecurityException e10) {
            throw new IOException("mkdirs for file(" + file.getAbsolutePath() + ") fail for SecurityReason: " + e10.getMessage(), e10);
        }
    }

    public static void K(String str) throws IOException {
        J(new File(str));
    }

    public static void L(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            J(parentFile);
        }
    }

    public static void M(String str) throws IOException {
        File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            J(parentFile);
        }
    }

    public static boolean N(File file, File file2) throws IOException {
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            try {
                return file.renameTo(file2);
            } catch (SecurityException e10) {
                throw new IOException("rename file(" + file + ") to path(" + file2 + ") failed for SecurityReason: " + e10.getMessage(), e10);
            }
        }
        if (!file.isDirectory()) {
            return true;
        }
        J(file2);
        for (File file3 : file.listFiles()) {
            if (!N(file3, new File(file2, file3.getName()))) {
                return false;
            }
        }
        try {
            return file.delete();
        } catch (SecurityException e11) {
            throw new IOException("delete file(" + file + ") fail for SecurityReason: " + e11.getMessage(), e11);
        }
    }

    public static boolean O(String str, String str2) throws IOException {
        return N(new File(str), new File(str2));
    }

    public static void P(Activity activity, String str, File file) {
        try {
            activity.startActivity(t(activity, str, file));
        } catch (ActivityNotFoundException unused) {
            r0.g(activity, activity.getString(C2947b.m.f129545N0), 1);
        }
    }

    public static void Q(Parcel parcel, File file) throws IOException {
        byte[] bArrV = V(file);
        parcel.unmarshall(bArrV, 0, bArrV.length);
        parcel.setDataPosition(0);
    }

    public static void R(Parcel parcel, File file) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(parcel.marshall());
                f(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                f(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean S(File file) {
        if (file.isFile()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        boolean z10 = true;
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (S(file2)) {
                l(file2);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static void T(String str) {
        if (new File(str).exists()) {
            String strA = w.y.a("rm -rf ", str);
            try {
                Runtime.getRuntime().exec(strA);
            } catch (IOException e10) {
                Log.e(f162158a, "command failed: " + strA, e10);
            }
        }
    }

    public static void U(Activity activity, String str, File file) {
        try {
            activity.startActivity(u(activity, str, file));
        } catch (ActivityNotFoundException unused) {
            r0.g(activity, activity.getString(C2947b.m.f129548O0), 1);
        }
    }

    public static byte[] V(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return W(fileInputStream);
        } finally {
            f(fileInputStream);
        }
    }

    public static byte[] W(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static boolean X(File file, o6.l<File> lVar, @Nullable o6.k kVar) {
        File[] fileArrListFiles;
        if (!file.isFile() && (fileArrListFiles = file.listFiles()) != null) {
            if (kVar != null) {
                kVar.d(fileArrListFiles.length);
            }
            int length = fileArrListFiles.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    File file2 = fileArrListFiles[i10];
                    WalkCmd walkCmdA = lVar.a(file2);
                    if (walkCmdA == WalkCmd.STOP) {
                        break;
                    }
                    if (walkCmdA != WalkCmd.OUTSIDE) {
                        if (file2.isDirectory() && walkCmdA == WalkCmd.INSIDE && !X(file2, lVar, kVar)) {
                            break;
                        }
                        if (kVar != null) {
                            kVar.c(1L);
                            kVar.e();
                        }
                        i10++;
                    } else if (kVar != null) {
                        kVar.f();
                        return true;
                    }
                } else if (kVar != null) {
                    kVar.f();
                }
            }
            return false;
        }
        return true;
    }

    public static boolean Y(ContentResolver contentResolver, Uri uri, InputStream inputStream, boolean z10) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(contentResolver.openOutputStream(uri, z10 ? "wa" : "w"));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        bufferedOutputStream2.flush();
                        f(bufferedOutputStream2);
                        return true;
                    }
                    bufferedOutputStream2.write(bArr, 0, i10);
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                f(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean Z(File file, InputStream inputStream, boolean z10) throws Throwable {
        if (!j(file) || inputStream == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z10));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        bufferedOutputStream2.flush();
                        e(inputStream, bufferedOutputStream2);
                        return true;
                    }
                    bufferedOutputStream2.write(bArr, 0, i10);
                }
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                e(inputStream, bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f162160c;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static void a0(byte[] bArr, File file) throws Throwable {
        Throwable th;
        FileChannel channel;
        ReadableByteChannel readableByteChannelNewChannel;
        FileOutputStream fileOutputStream = null;
        try {
            readableByteChannelNewChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    channel = fileOutputStream2.getChannel();
                    try {
                        channel.transferFrom(readableByteChannelNewChannel, 0L, bArr.length);
                        f(fileOutputStream2);
                        f(readableByteChannelNewChannel);
                        f(channel);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        f(fileOutputStream);
                        f(readableByteChannelNewChannel);
                        f(channel);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                }
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (Throwable th5) {
            th = th5;
            channel = null;
            readableByteChannelNewChannel = null;
        }
    }

    public static String b(String str) throws IOException {
        return str.startsWith(File.separator) ? new File(str).getCanonicalPath() : new File(str).getCanonicalPath().substring(1);
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() ? file.canWrite() : file.getParentFile().canWrite();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                Log.e(f162158a, "close failed: " + e10.getMessage(), e10);
            }
        }
    }

    public static void e(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            d(closeable);
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void g(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            f(closeable);
        }
    }

    public static void h(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            J(parentFile);
        }
        file.createNewFile();
    }

    public static boolean i(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    public static boolean j(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!i(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean k(String str) {
        return j(new File(str));
    }

    public static boolean l(File file) {
        try {
            return file.delete();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean m(File file) {
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                try {
                    return file.delete();
                } catch (SecurityException unused) {
                    return false;
                }
            }
            for (File file2 : fileArrListFiles) {
                if (!m(file2)) {
                    return false;
                }
            }
        }
        try {
            return file.delete();
        } catch (SecurityException unused2) {
            return false;
        }
    }

    public static boolean n(String str) {
        return m(new File(str));
    }

    public static boolean o(File file, boolean z10) {
        if (file.isFile()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (z10) {
                if (o(file2, true)) {
                    return true;
                }
            } else if (file2.isFile()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static String p(String str) {
        if (str == null || str.length() == 0) {
            return File.separator;
        }
        if (str.length() == 1) {
            String str2 = File.separator;
            return str.equals(str2) ? str2 : androidx.compose.runtime.changelist.j.a(str2, str);
        }
        int length = str.length();
        int i10 = 0;
        while (str.charAt(i10) == File.separatorChar) {
            i10++;
        }
        while (length > i10 && str.charAt(length - 1) == File.separatorChar) {
            length--;
        }
        if (i10 == 1 && length == str.length()) {
            return str;
        }
        return File.separator + str.substring(i10, length);
    }

    public static String q(String str) {
        return (String) b.f162162a.get(x(str).toLowerCase());
    }

    public static String r(String str) {
        int iLastIndexOf;
        return (StringUtils.j(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(iLastIndexOf + 1);
    }

    public static String s(String str) {
        if (StringUtils.j(str)) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(File.separator);
        return iLastIndexOf2 == -1 ? iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf) : (iLastIndexOf == -1 || iLastIndexOf2 > iLastIndexOf) ? str.substring(iLastIndexOf2 + 1) : str.substring(iLastIndexOf2 + 1, iLastIndexOf);
    }

    public static Intent t(Context context, String str, File file) {
        Uri uriW = w(context, str, file);
        String strQ = q(file.getAbsolutePath());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addFlags(3);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(uriW, strQ);
        return intent;
    }

    public static Intent u(Context context, String str, File file) {
        return v(str, q(file.getAbsolutePath()), w(context, str, file));
    }

    public static Intent v(String str, String str2, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setFlags(268435456);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(str2);
        return intent;
    }

    public static Uri w(Context context, String str, File file) {
        return Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, str, file) : Uri.fromFile(file);
    }

    @NonNull
    public static String x(String str) {
        return str == null ? "" : C5150b.e(str).c();
    }

    @NonNull
    public static FileType y(String str) {
        FileType fileType = (FileType) a.f162161a.get(x(str).toLowerCase());
        return fileType == null ? FileType.UNKNOWN : fileType;
    }

    @NonNull
    public static FileType z(String str) {
        FileType fileType = (FileType) a.f162161a.get(str);
        return fileType == null ? FileType.UNKNOWN : fileType;
    }
}
