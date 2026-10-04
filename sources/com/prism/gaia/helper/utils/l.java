package com.prism.gaia.helper.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.commons.exception.DiskNoSpaceException;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.naked.compat.libcore.io.OsCompat2;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165154a = "l";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f165155b = 32768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f165156c = "_NULL_FilePath_";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern[] f165157d = {Pattern.compile("not enough space"), Pattern.compile("no space left")};

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static a f165158b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, C0673a> f165159a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: com.prism.gaia.helper.utils.l$a$a, reason: collision with other inner class name */
        public class C0673a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public FileChannel f165160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public RandomAccessFile f165161b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public FileLock f165162c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f165163d;

            public C0673a(FileLock fileLock, int i10, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
                this.f165162c = fileLock;
                this.f165163d = i10;
                this.f165161b = randomAccessFile;
                this.f165160a = fileChannel;
            }
        }

        public static a d() {
            if (f165158b == null) {
                f165158b = new a();
            }
            return f165158b;
        }

        public boolean a(File file) {
            if (file == null) {
                return false;
            }
            try {
                File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2.getAbsolutePath(), "rw");
                FileChannel channel = randomAccessFile.getChannel();
                FileLock fileLockLock = channel.lock();
                if (!fileLockLock.isValid()) {
                    return false;
                }
                c(file2.getAbsolutePath(), fileLockLock, randomAccessFile, channel);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final int b(String str) {
            if (!this.f165159a.containsKey(str)) {
                return 0;
            }
            C0673a c0673a = this.f165159a.get(str);
            int i10 = c0673a.f165163d - 1;
            c0673a.f165163d = i10;
            if (i10 <= 0) {
                this.f165159a.remove(str);
            }
            return i10;
        }

        public final int c(String str, FileLock fileLock, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
            if (!this.f165159a.containsKey(str)) {
                this.f165159a.put(str, new C0673a(fileLock, 1, randomAccessFile, fileChannel));
                return 1;
            }
            C0673a c0673a = this.f165159a.get(str);
            int i10 = c0673a.f165163d;
            c0673a.f165163d = i10 + 1;
            return i10;
        }

        public void e(File file) {
            C0673a c0673a;
            File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
            if (file2.exists() && this.f165159a.containsKey(file2.getAbsolutePath()) && (c0673a = this.f165159a.get(file2.getAbsolutePath())) != null) {
                FileLock fileLock = c0673a.f165162c;
                RandomAccessFile randomAccessFile = c0673a.f165161b;
                FileChannel fileChannel = c0673a.f165160a;
                try {
                    if (b(file2.getAbsolutePath()) <= 0) {
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public interface b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f165165A = 509;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f165166B = 511;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f165167a = 4095;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f165168b = 2048;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f165169c = 1024;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f165170d = 512;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f165171e = 448;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f165172f = 256;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f165173g = 128;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f165174h = 64;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f165175i = 56;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f165176j = 32;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f165177k = 16;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f165178l = 8;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f165179m = 7;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f165180n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f165181o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f165182p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f165183q = 288;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f165184r = 292;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f165185s = 356;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f165186t = 365;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f165187u = 432;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f165188v = 420;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f165189w = 436;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f165190x = 484;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f165191y = 493;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f165192z = 508;
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f165193a = 9997;
    }

    public static void A(String str, int i10, boolean z10) throws IOException {
        File[] fileArrListFiles;
        if (!z10) {
            OsCompat2.Util.expandModeOfFile(str, i10);
            return;
        }
        OsCompat2.Util.expandModeOfFile(str, i10);
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            A(file2.getAbsolutePath(), i10, true);
        }
    }

    public static void B(String str, int i10) throws IOException {
        OsCompat2.Util.fixModeOfFile(str, i10, GaiaContext.j().R());
    }

    public static void C(String str, int i10, int i11) throws IOException {
        OsCompat2.Util.fixModeOfFile(str, i10, i11);
    }

    public static String D(Context context) {
        return context.getFilesDir().getAbsolutePath();
    }

    public static void E(IOException iOException) throws IOException {
        if (!d(iOException)) {
            throw iOException;
        }
        throw new DiskNoSpaceException(iOException);
    }

    public static boolean F(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static boolean G(String str) {
        return str != null && str.equals(a(str));
    }

    public static boolean H(char c10) {
        return (c10 == 0 || c10 == '/') ? false : true;
    }

    public static List<String> I(String str) {
        ArrayList arrayList = new ArrayList();
        String[] list = new File(str).list();
        if (list != null) {
            arrayList.addAll(Arrays.asList(list));
        }
        return arrayList;
    }

    public static void J(File file) throws IOException {
        K(file, -1);
    }

    public static void K(File file, int i10) throws IOException {
        boolean zMkdirs;
        if (file.exists()) {
            return;
        }
        try {
            zMkdirs = file.mkdirs();
            if (i10 >= 0) {
                try {
                    OsCompat2.Util.chmod(file.getAbsolutePath(), i10);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new IOException("FileUtils.makeDirs() fail: SecurityException return: " + zMkdirs + " msg: " + e.getMessage(), e);
                }
            }
        } catch (SecurityException e11) {
            e = e11;
            zMkdirs = false;
        }
    }

    public static void L(String str) throws IOException {
        K(new File(str), -1);
    }

    public static int M(int i10) {
        return i10 & b.f165167a;
    }

    public static boolean N(File file, File file2) throws IOException {
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.renameTo(file2);
        }
        if (!file.isDirectory()) {
            return true;
        }
        K(file2, -1);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                if (!N(file3, new File(file2, file3.getName()))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean O(String str, String str2) throws IOException {
        return N(new File(str), new File(str2));
    }

    public static void P(Parcel parcel, File file) throws IOException {
        byte[] bArrA0 = a0(file);
        parcel.unmarshall(bArrA0, 0, bArrA0.length);
        parcel.setDataPosition(0);
    }

    public static void Q(Parcel parcel, File file) throws Throwable {
        byte[] bArrMarshall = parcel.marshall();
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                fileOutputStream2.write(bArrMarshall);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.getFD().sync();
                } catch (Throwable unused) {
                }
                j(fileOutputStream2);
                if (file2.renameTo(file)) {
                    if (file2.exists()) {
                        file2.delete();
                        return;
                    }
                    return;
                } else {
                    throw new IOException("cannot rename " + file2 + " onto " + file);
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        j(fileOutputStream);
        if (file2.exists()) {
            file2.delete();
        }
        throw th;
    }

    public static GFile R(Parcel parcel) {
        String string = parcel.readString();
        if (f165156c.equals(string)) {
            return null;
        }
        return new GFile(string);
    }

    public static void S(Parcel parcel, File file) {
        if (file == null) {
            parcel.writeString(f165156c);
        } else {
            parcel.writeString(file.getAbsolutePath());
        }
    }

    public static int T(byte[] bArr, int i10, ByteOrder byteOrder) {
        int i11;
        int i12;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
            i12 = bArr[i10 + 3] & 255;
        } else {
            i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
            i12 = (bArr[i10 + 3] & 255) << 24;
        }
        return i12 | i11;
    }

    public static String U(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                String string = stringBuffer.toString();
                try {
                    bufferedReader.close();
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return string;
            } catch (Exception unused3) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused4) {
                        return "";
                    }
                }
                if (fileInputStream == null) {
                    return "";
                }
                fileInputStream.close();
                return "";
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused5) {
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Exception unused6) {
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            bufferedReader = null;
        }
    }

    public static String V(String str) {
        return U(new File(str));
    }

    public static void W(File file, ParcelFileDescriptor parcelFileDescriptor) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            X(fileInputStream, parcelFileDescriptor);
            j(fileInputStream);
        } catch (IOException e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            file.getAbsolutePath();
            e.getMessage();
            j(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            j(fileInputStream2);
            throw th;
        }
    }

    public static void X(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        try {
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        autoCloseOutputStream.write(bArr, 0, i10);
                    }
                }
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static boolean Y(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static byte[] Z(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        return b0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || IconCache.EMPTY_CLASS_NAME.equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (H(cCharAt)) {
                sb2.append(cCharAt);
            } else {
                sb2.append(Ra.b.f67799c);
            }
        }
        return sb2.toString();
    }

    public static byte[] a0(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[(int) file.length()];
            int length = (int) file.length();
            int i10 = 0;
            do {
                int i11 = fileInputStream.read(bArr, i10, length);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
                length = ((int) file.length()) - i10;
            } while (length > 0);
            return bArr;
        } finally {
            j(fileInputStream);
        }
    }

    public static File b(File file, String str) {
        String strA;
        String absolutePath = file.getAbsolutePath();
        if (absolutePath.endsWith(str)) {
            return file;
        }
        int iLastIndexOf = absolutePath.lastIndexOf(IconCache.EMPTY_CLASS_NAME);
        if (iLastIndexOf > 0) {
            strA = absolutePath.substring(0, iLastIndexOf + 1) + str;
        } else {
            strA = androidx.concurrent.futures.a.a(absolutePath, IconCache.EMPTY_CLASS_NAME, str);
        }
        return new File(strA);
    }

    public static byte[] b0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[32768];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 32768);
            if (i10 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static boolean c(File file, int i10, long j10) {
        long j11;
        if (file.length() < i10) {
            return false;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
            randomAccessFile.skipBytes(i10);
            j11 = randomAccessFile.readInt();
        } catch (IOException unused) {
            j11 = 0;
        }
        return j11 == j10;
    }

    public static void c0(ParcelFileDescriptor parcelFileDescriptor, File file, @Nullable o6.h<Long> hVar) throws Throwable {
        FileOutputStream fileOutputStream;
        w(file, -1);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            d0(parcelFileDescriptor, fileOutputStream, hVar);
            j(fileOutputStream);
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            file.getAbsolutePath();
            e.getMessage();
            throw e;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            throw th;
        }
    }

    public static final boolean d(IOException iOException) {
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase();
        for (Pattern pattern : f165157d) {
            if (pattern.matcher(lowerCase).find()) {
                return true;
            }
        }
        return false;
    }

    public static void d0(ParcelFileDescriptor parcelFileDescriptor, OutputStream outputStream, @Nullable o6.h<Long> hVar) throws IOException {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            byte[] bArr = new byte[32768];
            while (true) {
                int i10 = autoCloseInputStream.read(bArr);
                if (i10 <= 0) {
                    outputStream.flush();
                    try {
                        parcelFileDescriptor.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    outputStream.write(bArr, 0, i10);
                    if (hVar != null) {
                        hVar.a(Long.valueOf(i10));
                    }
                }
            }
        } catch (Throwable th) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static void e(String str, int i10) throws IOException {
        OsCompat2.Util.chmod(str, i10);
    }

    public static void e0(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[32768];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 32768);
            if (i10 == -1) {
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i10);
        }
    }

    public static void f(String str, int i10, boolean z10) throws IOException {
        File[] fileArrListFiles;
        if (!z10) {
            OsCompat2.Util.chmod(str, i10);
            return;
        }
        OsCompat2.Util.chmod(str, i10);
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            f(file2.getAbsolutePath(), i10, true);
        }
    }

    public static void f0(byte[] bArr, File file) throws Throwable {
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
                        j(fileOutputStream2);
                        j(readableByteChannelNewChannel);
                        j(channel);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        j(fileOutputStream);
                        j(readableByteChannelNewChannel);
                        j(channel);
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

    public static void g(String str, int i10) throws IOException {
        File file = new File(str);
        if (!file.isDirectory()) {
            if (file.isFile()) {
                OsCompat2.Util.chmod(str, i10);
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                g(file2.getAbsolutePath(), i10);
            }
        }
    }

    public static void h(String str, int i10, int i11) throws IOException {
        OsCompat2.Util.chown(str, i10, i11);
    }

    public static void i(String str, int i10, int i11, boolean z10) throws IOException {
        File[] fileArrListFiles;
        if (!z10) {
            OsCompat2.Util.chown(str, i10, i11);
            return;
        }
        OsCompat2.Util.chown(str, i10, i11);
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            i(file2.getAbsolutePath(), i10, i11, true);
        }
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void k(String str, int i10, boolean z10) throws IOException {
        String str2 = (z10 && new File(str).isDirectory()) ? "chmod -R " : "chmod ";
        String str3 = String.format("%o", Integer.valueOf(i10));
        try {
            Runtime.getRuntime().exec(str2 + str3 + C4.q.f17581a + str).waitFor();
        } catch (InterruptedException e10) {
            throw new IOException("commandChmod InterruptedException ", e10);
        }
    }

    public static void l(File file, File file2) throws Throwable {
        m(file, file2, null);
    }

    public static void m(File file, File file2, o6.h<Long> hVar) throws Throwable {
        if (file.exists()) {
            if (file.isFile()) {
                o(file, file2, hVar);
                return;
            }
            if (file.isDirectory()) {
                K(file2, OsCompat2.Util.getModeOfFile(file.getAbsolutePath()));
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        m(file3, new File(file2, file3.getName()), hVar);
                    }
                }
            }
        }
    }

    public static void n(File file, File file2) throws Throwable {
        o(file, file2, null);
    }

    public static void o(File file, File file2, o6.h<Long> hVar) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream2.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32768);
                    while (true) {
                        byteBufferAllocate.clear();
                        int i10 = channel.read(byteBufferAllocate);
                        if (i10 < 0) {
                            j(fileInputStream2);
                            j(fileOutputStream);
                            return;
                        } else {
                            byteBufferAllocate.limit(byteBufferAllocate.position());
                            byteBufferAllocate.position(0);
                            channel2.write(byteBufferAllocate);
                            if (hVar != null) {
                                hVar.a(Long.valueOf(i10));
                            }
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    try {
                        if (!d(e)) {
                            throw e;
                        }
                        throw new DiskNoSpaceException(e);
                    } catch (Throwable th) {
                        th = th;
                        j(fileInputStream);
                        j(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    j(fileInputStream);
                    j(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static void p(String str, String str2) throws Throwable {
        o(new File(str), new File(str2), null);
    }

    public static void q(String str, String str2, o6.h<Long> hVar) throws Throwable {
        o(new File(str), new File(str2), hVar);
    }

    public static void r(String str, String str2) throws Exception {
        Os.symlink(str, str2);
    }

    public static boolean s(File file) {
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return file.delete();
            }
            for (File file2 : fileArrListFiles) {
                if (!s(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean t(String str) {
        return s(new File(str));
    }

    public static long u(File file) {
        File[] fileArrListFiles;
        if (file.isFile()) {
            return file.length();
        }
        long jU = 0;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                jU += u(file2);
            }
        }
        return jU;
    }

    public static String v(File file) throws IOException {
        return w(file, -1);
    }

    public static String w(File file, int i10) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return null;
        }
        if (!parentFile.exists()) {
            K(parentFile, i10);
        }
        return parentFile.getAbsolutePath();
    }

    public static String x(String str) throws IOException {
        return w(new File(str), -1);
    }

    public static String y(String str, int i10) throws IOException {
        return w(new File(str), i10);
    }

    public static void z(String str, int i10) throws IOException {
        OsCompat2.Util.expandModeOfFile(str, i10);
    }
}
