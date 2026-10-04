package D9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.compat.dalvik.system.BaseDexClassLoaderCompat2;
import dalvik.system.BaseDexClassLoader;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public class f extends ClassLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23024b = l0.b(f.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseDexClassLoader f23025a;

    public f(@NonNull ByteBuffer[] byteBufferArr, @Nullable String str, ClassLoader classLoader) {
        super(classLoader);
        this.f23025a = BaseDexClassLoaderCompat2.Util.ctor(byteBufferArr, str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        BaseDexClassLoader baseDexClassLoader = this.f23025a;
        return baseDexClassLoader == null ? super.findClass(str) : BaseDexClassLoaderCompat2.Util.findClass(baseDexClassLoader, str);
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        BaseDexClassLoader baseDexClassLoader = this.f23025a;
        return baseDexClassLoader == null ? super.findLibrary(str) : BaseDexClassLoaderCompat2.Util.findLibrary(baseDexClassLoader, str);
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        BaseDexClassLoader baseDexClassLoader = this.f23025a;
        return baseDexClassLoader == null ? super.findResource(str) : BaseDexClassLoaderCompat2.Util.findResource(baseDexClassLoader, str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        BaseDexClassLoader baseDexClassLoader = this.f23025a;
        return baseDexClassLoader == null ? super.findResources(str) : BaseDexClassLoaderCompat2.Util.findResources(baseDexClassLoader, str);
    }
}
