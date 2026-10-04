package M3;

import android.app.Application;
import android.support.v4.media.c;
import android.util.Log;
import androidx.compose.runtime.internal.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nJvmObjectStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmObjectStore.kt\ncom/cookiegames/smartcookie/adblock/util/object/JvmObjectStore\n+ 2 CloseableExtensions.kt\ncom/cookiegames/smartcookie/extensions/CloseableExtensionsKt\n*L\n1#1,56:1\n10#2,5:57\n10#2,5:62\n*S KotlinDebug\n*F\n+ 1 JvmObjectStore.kt\ncom/cookiegames/smartcookie/adblock/util/object/JvmObjectStore\n*L\n33#1:57,5\n46#1:62,5\n*E\n"})
@r(parameters = 0)
public final class a<T extends Serializable> implements b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58802c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f58803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final K3.b<String> f58804b;

    public a(@NotNull Application application, @NotNull K3.b<String> hashingAlgorithm) {
        G.p(application, "application");
        G.p(hashingAlgorithm, "hashingAlgorithm");
        this.f58803a = application;
        this.f58804b = hashingAlgorithm;
    }

    @Override // M3.b
    public void a(@NotNull String key) {
        G.p(key, "key");
        d(key).delete();
    }

    @Override // M3.b
    @Nullable
    public T b(@NotNull String key) {
        G.p(key, "key");
        File fileD = d(key);
        if (fileD.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileD));
            try {
                try {
                    T t10 = (T) objectInputStream.readObject();
                    G.n(t10, "null cannot be cast to non-null type T of com.cookiegames.smartcookie.adblock.util.object.JvmObjectStore");
                    objectInputStream.close();
                    return t10;
                } finally {
                }
            } catch (Throwable th) {
                Log.e("Closeable", "Unable to parse results", th);
            }
        }
        return null;
    }

    @Override // M3.b
    public void c(@NotNull String key, @NotNull T value) {
        G.p(key, "key");
        G.p(value, "value");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(d(key), false));
        try {
            try {
                objectOutputStream.writeObject(value);
                objectOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            Log.e("Closeable", "Unable to parse results", th);
        }
    }

    public final File d(String str) {
        return new File(this.f58803a.getCacheDir(), c.a("object-store-", this.f58804b.a(str)));
    }
}
