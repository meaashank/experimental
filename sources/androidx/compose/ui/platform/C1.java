package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1 implements InterfaceC5000m<B1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103444b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<B1> f103445a = new ArrayList();

    public final void c(@NotNull String str, @Nullable Object obj) {
        this.f103445a.add(new B1(str, obj));
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<B1> iterator() {
        return this.f103445a.iterator();
    }
}
