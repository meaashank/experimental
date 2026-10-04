package y4;

import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class C5825f extends C5822c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f241098e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5825f(@NotNull String queryUrl) {
        super("file:///android_asset/smartcookieweb.webp", queryUrl, p.s.cf);
        G.p(queryUrl, "queryUrl");
    }
}
