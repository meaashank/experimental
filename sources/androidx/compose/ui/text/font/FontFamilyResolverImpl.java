package androidx.compose.ui.text.font;

import androidx.compose.runtime.X1;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.font.W;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,256:1\n151#2,3:257\n33#2,4:260\n154#2,2:264\n38#2:266\n156#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:257,3\n47#1:260,4\n47#1:264,2\n47#1:266\n47#1:267\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FontFamilyResolverImpl implements AbstractC2325w.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104484g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final U f104485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final W f104486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TypefaceRequestCache f104487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FontListFontFamilyTypefaceAdapter f104488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final T f104489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ed.l<q0, Object> f104490f;

    public FontFamilyResolverImpl(@NotNull U u10, @NotNull W w10, @NotNull TypefaceRequestCache typefaceRequestCache, @NotNull FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @NotNull T t10) {
        this.f104485a = u10;
        this.f104486b = w10;
        this.f104487c = typefaceRequestCache;
        this.f104488d = fontListFontFamilyTypefaceAdapter;
        this.f104489e = t10;
        this.f104490f = new ed.l<q0, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull q0 q0Var) {
                return this.f104491d.h(q0.g(q0Var, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.AbstractC2325w.b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.AbstractC2325w r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.f104496e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104496e = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f104494c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f104496e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r12 = r0.f104493b
            androidx.compose.ui.text.font.w r12 = (androidx.compose.ui.text.font.AbstractC2325w) r12
            java.lang.Object r0 = r0.f104492a
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r0
            kotlin.C4885d0.n(r13)
            goto L53
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.C4885d0.n(r13)
            boolean r13 = r12 instanceof androidx.compose.ui.text.font.D
            if (r13 != 0) goto L41
            kotlin.L0 r12 = kotlin.L0.f217464a
            return r12
        L41:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r13 = r11.f104488d
            androidx.compose.ui.text.font.U r2 = r11.f104485a
            r0.f104492a = r11
            r0.f104493b = r12
            r0.f104496e = r3
            java.lang.Object r13 = r13.e(r12, r2, r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            r0 = r11
        L53:
            r13 = r12
            androidx.compose.ui.text.font.D r13 = (androidx.compose.ui.text.font.D) r13
            java.util.List<androidx.compose.ui.text.font.v> r13 = r13.f104478j
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r13.size()
            r1.<init>(r2)
            int r2 = r13.size()
            r3 = 0
        L66:
            if (r3 >= r2) goto La0
            java.lang.Object r4 = r13.get(r3)
            androidx.compose.ui.text.font.v r4 = (androidx.compose.ui.text.font.InterfaceC2324v) r4
            androidx.compose.ui.text.font.q0 r5 = new androidx.compose.ui.text.font.q0
            androidx.compose.ui.text.font.W r6 = r0.f104486b
            androidx.compose.ui.text.font.w r6 = r6.a(r12)
            androidx.compose.ui.text.font.W r7 = r0.f104486b
            androidx.compose.ui.text.font.L r8 = r4.getWeight()
            androidx.compose.ui.text.font.L r7 = r7.b(r8)
            androidx.compose.ui.text.font.W r8 = r0.f104486b
            int r4 = r4.b()
            int r8 = r8.c(r4)
            androidx.compose.ui.text.font.I$a r4 = androidx.compose.ui.text.font.I.f104531b
            r4.getClass()
            int r9 = androidx.compose.ui.text.font.I.f104533d
            androidx.compose.ui.text.font.U r4 = r0.f104485a
            java.lang.Object r10 = r4.a()
            r5.<init>(r6, r7, r8, r9, r10)
            r1.add(r5)
            int r3 = r3 + 1
            goto L66
        La0:
            androidx.compose.ui.text.font.TypefaceRequestCache r12 = r0.f104487c
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r13 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r13.<init>()
            r12.e(r1, r13)
            kotlin.L0 r12 = kotlin.L0.f217464a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.a(androidx.compose.ui.text.font.w, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.AbstractC2325w.b
    @NotNull
    public X1<Object> b(@Nullable AbstractC2325w abstractC2325w, @NotNull L l10, int i10, int i11) {
        return h(new q0(this.f104486b.a(abstractC2325w), this.f104486b.b(l10), this.f104486b.c(i10), this.f104486b.d(i11), this.f104485a.a()));
    }

    @NotNull
    public final U g() {
        return this.f104485a;
    }

    public final X1<Object> h(final q0 q0Var) {
        return this.f104487c.f(q0Var, new ed.l<ed.l<? super r0, ? extends L0>, r0>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final r0 invoke(@NotNull ed.l<? super r0, L0> lVar) {
                FontFamilyResolverImpl fontFamilyResolverImpl = this.f104500d;
                r0 r0VarA = fontFamilyResolverImpl.f104488d.a(q0Var, fontFamilyResolverImpl.f104485a, lVar, fontFamilyResolverImpl.f104490f);
                if (r0VarA != null) {
                    return r0VarA;
                }
                FontFamilyResolverImpl fontFamilyResolverImpl2 = this.f104500d;
                r0 r0VarA2 = fontFamilyResolverImpl2.f104489e.a(q0Var, fontFamilyResolverImpl2.f104485a, lVar, fontFamilyResolverImpl2.f104490f);
                if (r0VarA2 != null) {
                    return r0VarA2;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public FontFamilyResolverImpl(U u10, W w10, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, T t10, int i10, C4969v c4969v) {
        if ((i10 & 2) != 0) {
            W.f104593a.getClass();
            w10 = W.a.f104595b;
        }
        this(u10, w10, (i10 & 4) != 0 ? C2328z.b() : typefaceRequestCache, (i10 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(C2328z.a(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i10 & 16) != 0 ? new T() : t10);
    }
}
