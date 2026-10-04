package O;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@androidx.compose.ui.i
public final class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65064b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, z> f65065a = new LinkedHashMap();

    @NotNull
    public final Map<Integer, z> a() {
        return this.f65065a;
    }

    @Nullable
    public final L0 b(int i10, @NotNull String str) {
        ed.l<String, L0> lVar;
        z zVar = this.f65065a.get(Integer.valueOf(i10));
        if (zVar == null || (lVar = zVar.f65128c) == null) {
            return null;
        }
        lVar.invoke(str);
        return L0.f217464a;
    }

    public final void c(@NotNull z zVar) {
        this.f65065a.put(Integer.valueOf(zVar.f65129d), zVar);
    }
}
