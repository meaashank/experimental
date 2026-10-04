package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;
import dd.j;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
@j(name = "PathSegmentUtilities")
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PathSegment f113929a = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PathSegment f113930b = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    @NotNull
    public static final PathSegment a() {
        return f113930b;
    }

    @NotNull
    public static final PathSegment b() {
        return f113929a;
    }
}
