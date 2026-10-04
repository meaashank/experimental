package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.r;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nUnsupportedComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,53:1\n12744#2,2:54\n*S KotlinDebug\n*F\n+ 1 UnsupportedComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation\n*L\n40#1:54,2\n*E\n"})
@r(parameters = 0)
public final class j implements ComposeAnimation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f105339e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105340f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f105341g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f105342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComposeAnimationType f105343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f105344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<Integer> f105345d;

    public static final class a {
        public a() {
        }

        @Nullable
        public final j a(@Nullable String str) {
            if (j.f105341g) {
                return new j(str);
            }
            return null;
        }

        public final boolean b() {
            return j.f105341g;
        }

        @TestOnly
        public final void c(boolean z10) {
            j.f105341g = z10;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (G.g(composeAnimationTypeArrValues[i10].name(), "UNSUPPORTED")) {
                z10 = true;
                break;
            }
            i10++;
        }
        f105341g = z10;
    }

    public /* synthetic */ j(String str, C4969v c4969v) {
        this(str);
    }

    @NotNull
    public Object c() {
        return this.f105344c;
    }

    @Nullable
    public String d() {
        return this.f105342a;
    }

    @NotNull
    public Set<Integer> e() {
        return this.f105345d;
    }

    @NotNull
    public ComposeAnimationType f() {
        return this.f105343b;
    }

    public j(String str) {
        this.f105342a = str;
        this.f105343b = ComposeAnimationType.UNSUPPORTED;
        this.f105344c = 0;
        this.f105345d = EmptySet.f217512a;
    }
}
