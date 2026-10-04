package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import androidx.activity.result.i;
import com.android.launcher3.IconCache;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f114870a = "MultiDex";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f114871b = "secondary-dexes";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f114872c = "code_cache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f114873d = "secondary-dexes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114874e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114875f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f114876g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f114877h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f114878i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<File> f114879j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f114880k = n(System.getProperty("java.vm.version"));

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f114881b = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0308a f114882a;

        /* JADX INFO: renamed from: androidx.multidex.b$a$a, reason: collision with other inner class name */
        public interface InterfaceC0308a {
            Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException;
        }

        /* JADX INFO: renamed from: androidx.multidex.b$a$b, reason: collision with other inner class name */
        public static class C0309b implements InterfaceC0308a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Constructor<?> f114883a;

            public C0309b(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f114883a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0308a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
                return this.f114883a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        public static class c implements InterfaceC0308a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Constructor<?> f114884a;

            public c(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f114884a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0308a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f114884a.newInstance(file, file, dexFile);
            }
        }

        public static class d implements InterfaceC0308a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Constructor<?> f114885a;

            public d(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f114885a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0308a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f114885a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        public a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            InterfaceC0308a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new C0309b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.f114882a = dVar;
        }

        public static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            Object[] objArrB = new a().b(list);
            try {
                b.f(obj, "dexElements", objArrB);
            } catch (NoSuchFieldException e10) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e10);
                b.f(obj, "pathElements", objArrB);
            }
        }

        public static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f114881b) + MultiDexExtractor.f114843i).getPath();
        }

        public final Object[] b(List<? extends File> list) throws IllegalAccessException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                File file = list.get(i10);
                objArr[i10] = this.f114882a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: androidx.multidex.b$b, reason: collision with other inner class name */
    public static final class C0310b {
        public static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            b.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) obj2);
                }
                Field fieldG = b.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldG.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldG.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        public static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) b.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static final class c {
        public static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
            int size = list.size();
            Field fieldG = b.g(classLoader, "path");
            StringBuilder sb2 = new StringBuilder((String) fieldG.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb2.append(':');
                sb2.append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                zipFileArr[iPreviousIndex] = new ZipFile(next);
                dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + MultiDexExtractor.f114843i, 0);
            }
            fieldG.set(classLoader, sb2.toString());
            b.f(classLoader, "mPaths", strArr);
            b.f(classLoader, "mFiles", fileArr);
            b.f(classLoader, "mZips", zipFileArr);
            b.f(classLoader, "mDexs", dexFileArr);
        }
    }

    public static void d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            }
        }
    }

    public static void e(Context context, File file, File file2, String str, String str2, boolean z10) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = f114879j;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        d(context);
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File fileJ = j(context, file2, str);
                    MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, fileJ);
                    try {
                        try {
                            m(classLoader, fileJ, multiDexExtractor.n(context, str2, false));
                        } catch (IOException e10) {
                            if (!z10) {
                                throw e10;
                            }
                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e10);
                            m(classLoader, fileJ, multiDexExtractor.n(context, str2, true));
                        }
                        try {
                            e = null;
                        } catch (IOException e11) {
                            e = e11;
                        }
                        if (e != null) {
                            throw e;
                        }
                    } finally {
                        try {
                            multiDexExtractor.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (RuntimeException e12) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e12);
                }
            } finally {
            }
        }
    }

    public static void f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldG = g(obj, str);
        Object[] objArr2 = (Object[]) fieldG.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldG.set(obj, objArr3);
    }

    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbA = i.a("Field ", str, " not found in ");
        sbA.append(obj.getClass());
        throw new NoSuchFieldException(sbA.toString());
    }

    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sbA = i.a("Method ", str, " with parameters ");
        sbA.append(Arrays.asList(clsArr));
        sbA.append(" not found in ");
        sbA.append(obj.getClass());
        throw new NoSuchMethodException(sbA.toString());
    }

    public static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e10) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
            return null;
        }
    }

    public static File j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, f114872c);
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), f114872c);
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void k(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f114880k) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo applicationInfoI = i(context);
            if (applicationInfoI == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                e(context, new File(applicationInfoI.sourceDir), new File(applicationInfoI.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e10) {
            Log.e("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    public static void l(Context context, Context context2) {
        Log.i("MultiDex", "Installing instrumentation");
        if (f114880k) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo applicationInfoI = i(context);
            if (applicationInfoI == null) {
                Log.i("MultiDex", "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            ApplicationInfo applicationInfoI2 = i(context2);
            if (applicationInfoI2 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            String str = context.getPackageName() + IconCache.EMPTY_CLASS_NAME;
            File file = new File(applicationInfoI2.dataDir);
            e(context2, new File(applicationInfoI.sourceDir), file, str + "secondary-dexes", str, false);
            e(context2, new File(applicationInfoI2.sourceDir), file, "secondary-dexes", "", false);
            Log.i("MultiDex", "Installation done");
        } catch (Exception e10) {
            Log.e("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    public static void m(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        C0310b.a(classLoader, list, file);
    }

    public static boolean n(String str) {
        boolean z10 = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int i10 = Integer.parseInt(matcher.group(1));
                    int i11 = Integer.parseInt(matcher.group(2));
                    if (i10 > 2 || (i10 == 2 && i11 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("VM with version ");
        sb2.append(str);
        sb2.append(z10 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb2.toString());
        return z10;
    }

    public static void o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
