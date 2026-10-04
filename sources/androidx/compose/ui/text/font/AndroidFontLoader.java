package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.F;
import kotlin.C4885d0;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AndroidFontLoader implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104428c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f104430b;

    public AndroidFontLoader(@NotNull Context context) {
        this.f104429a = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.U
    @Nullable
    public Object a() {
        return this.f104430b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.U
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.InterfaceC2324v r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super android.graphics.Typeface> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.f104435e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104435e = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f104433c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f104435e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f104432b
            androidx.compose.ui.text.font.v r6 = (androidx.compose.ui.text.font.InterfaceC2324v) r6
            java.lang.Object r0 = r0.f104431a
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.C4885d0.n(r7)
            goto L5c
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.C4885d0.n(r7)
            return r7
        L3e:
            kotlin.C4885d0.n(r7)
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.AbstractC2307d
            if (r7 != 0) goto L7d
            boolean r7 = r6 instanceof androidx.compose.ui.text.font.c0
            if (r7 == 0) goto L69
            r7 = r6
            androidx.compose.ui.text.font.c0 r7 = (androidx.compose.ui.text.font.c0) r7
            android.content.Context r2 = r5.f104429a
            r0.f104431a = r5
            r0.f104432b = r6
            r0.f104435e = r3
            java.lang.Object r7 = androidx.compose.ui.text.font.C2309f.d(r7, r2, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
        L5c:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            androidx.compose.ui.text.font.c0 r6 = (androidx.compose.ui.text.font.c0) r6
            androidx.compose.ui.text.font.K$e r6 = r6.f104610f
            android.content.Context r0 = r0.f104429a
            android.graphics.Typeface r6 = androidx.compose.ui.text.font.b0.c(r7, r6, r0)
            return r6
        L69:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L7d:
            androidx.compose.ui.text.font.d r6 = (androidx.compose.ui.text.font.AbstractC2307d) r6
            androidx.compose.ui.text.font.d$a r7 = r6.f104614d
            android.content.Context r1 = r5.f104429a
            r0.f104435e = r4
            r7.b(r1, r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.b(androidx.compose.ui.text.font.v, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.U
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface c(@NotNull InterfaceC2324v interfaceC2324v) {
        Object objA;
        Typeface typefaceC;
        if (interfaceC2324v instanceof AbstractC2307d) {
            AbstractC2307d abstractC2307d = (AbstractC2307d) interfaceC2324v;
            return abstractC2307d.f104614d.a(this.f104429a, abstractC2307d);
        }
        if (!(interfaceC2324v instanceof c0)) {
            return null;
        }
        c0 c0Var = (c0) interfaceC2324v;
        int i10 = c0Var.f104611g;
        F.a aVar = F.f104479b;
        aVar.getClass();
        if (i10 == F.f104480c) {
            typefaceC = C2309f.c((c0) interfaceC2324v, this.f104429a);
        } else {
            aVar.getClass();
            if (i10 != F.f104481d) {
                aVar.getClass();
                if (i10 == F.f104482e) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) F.j(c0Var.f104611g)));
            }
            try {
                objA = C2309f.c((c0) interfaceC2324v, this.f104429a);
            } catch (Throwable th) {
                objA = C4885d0.a(th);
            }
            typefaceC = (Typeface) (objA instanceof Result.Failure ? null : objA);
        }
        return b0.c(typefaceC, ((c0) interfaceC2324v).f104610f, this.f104429a);
    }
}
