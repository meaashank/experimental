package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.K;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class AbstractC2307d implements InterfaceC2324v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104612f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f104614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final K.e f104615e;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.d$a */
    public interface a {
        @Nullable
        Typeface a(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d);

        @Nullable
        Object b(@NotNull Context context, @NotNull AbstractC2307d abstractC2307d, @NotNull kotlin.coroutines.e<? super Typeface> eVar);
    }

    public /* synthetic */ AbstractC2307d(int i10, a aVar, K.e eVar, C4969v c4969v) {
        this(i10, aVar, eVar);
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v
    public final int a() {
        return this.f104613c;
    }

    @NotNull
    public final a c() {
        return this.f104614d;
    }

    @NotNull
    public final K.e d() {
        return this.f104615e;
    }

    @InterfaceC4982o(message = "Replaced with fontVariation constructor", replaceWith = @InterfaceC4852c0(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ AbstractC2307d(int i10, a aVar, C4969v c4969v) {
        this(i10, aVar);
    }

    public AbstractC2307d(int i10, a aVar, K.e eVar) {
        this.f104613c = i10;
        this.f104614d = aVar;
        this.f104615e = eVar;
    }

    public AbstractC2307d(int i10, a aVar) {
        this(i10, aVar, new K.e(new K.a[0]));
    }
}
