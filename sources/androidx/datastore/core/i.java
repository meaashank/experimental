package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface i<T> {
    T getDefaultValue();

    @Nullable
    Object readFrom(@NotNull InputStream inputStream, @NotNull kotlin.coroutines.e<? super T> eVar);

    @Nullable
    Object writeTo(T t10, @NotNull OutputStream outputStream, @NotNull kotlin.coroutines.e<? super L0> eVar);
}
