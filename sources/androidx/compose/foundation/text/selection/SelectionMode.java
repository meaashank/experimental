package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionMode {
    private static final /* synthetic */ SelectionMode[] $VALUES = $values();
    public static final SelectionMode Horizontal;
    public static final SelectionMode Vertical;

    public static final class Horizontal extends SelectionMode {
        public Horizontal(String str, int i10) {
            super(str, i10, null);
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo1compare3MmeM6k$foundation_release(long j10, @NotNull P.j jVar) {
            if (w.d(jVar, j10)) {
                return 0;
            }
            if (P.g.p(j10) < jVar.f65511a) {
                return -1;
            }
            return (P.g.r(j10) >= jVar.f65512b || P.g.p(j10) >= jVar.f65513c) ? 1 : -1;
        }
    }

    public static final class Vertical extends SelectionMode {
        public Vertical(String str, int i10) {
            super(str, i10, null);
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo1compare3MmeM6k$foundation_release(long j10, @NotNull P.j jVar) {
            if (w.d(jVar, j10)) {
                return 0;
            }
            if (P.g.r(j10) < jVar.f65512b) {
                return -1;
            }
            return (P.g.p(j10) >= jVar.f65511a || P.g.r(j10) >= jVar.f65514d) ? 1 : -1;
        }
    }

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        C4969v c4969v = null;
        Vertical = new Vertical("Vertical", 0, c4969v);
        Horizontal = new Horizontal("Horizontal", 1, c4969v);
    }

    public /* synthetic */ SelectionMode(String str, int i10, C4969v c4969v) {
        this(str, i10);
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m0containsInclusiveUv8p0NA(P.j jVar, long j10) {
        float f10 = jVar.f65511a;
        float f11 = jVar.f65513c;
        float fP = P.g.p(j10);
        if (f10 > fP || fP > f11) {
            return false;
        }
        float f12 = jVar.f65512b;
        float f13 = jVar.f65514d;
        float fR = P.g.r(j10);
        return f12 <= fR && fR <= f13;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1compare3MmeM6k$foundation_release(long j10, @NotNull P.j jVar);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m2isSelected2x9bVx0$foundation_release(@NotNull P.j jVar, long j10, long j11) {
        if (m0containsInclusiveUv8p0NA(jVar, j10) || m0containsInclusiveUv8p0NA(jVar, j11)) {
            return true;
        }
        return (mo1compare3MmeM6k$foundation_release(j10, jVar) > 0) ^ (mo1compare3MmeM6k$foundation_release(j11, jVar) > 0);
    }

    private SelectionMode(String str, int i10) {
    }
}
