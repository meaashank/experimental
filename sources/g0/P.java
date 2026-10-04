package G0;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n51#1:119\n31#1:121\n36#1:123\n1#2:118\n1#2:120\n1#2:122\n1#2:124\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n55#1:119\n58#1:121\n61#1:123\n55#1:120\n58#1:122\n61#1:124\n*E\n"})
public final class P {

    public static final class a implements Iterator<Rect>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RegionIterator f40047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f40048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f40049c;

        public a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f40047a = regionIterator;
            Rect rect = new Rect();
            this.f40048b = rect;
            this.f40049c = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.f40049c) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f40048b);
            this.f40049c = this.f40047a.next(this.f40048b);
            return rect;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40049c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final Region a(@NotNull Region region, @NotNull Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @NotNull
    public static final Region b(@NotNull Region region, @NotNull Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(@NotNull Region region, @NotNull Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void d(@NotNull Region region, @NotNull ed.l<? super Rect, L0> lVar) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    @NotNull
    public static final Iterator<Rect> e(@NotNull Region region) {
        return new a(region);
    }

    @NotNull
    public static final Region f(@NotNull Region region, @NotNull Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region g(@NotNull Region region, @NotNull Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @NotNull
    public static final Region h(@NotNull Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region i(@NotNull Region region, @NotNull Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @NotNull
    public static final Region j(@NotNull Region region, @NotNull Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @NotNull
    public static final Region k(@NotNull Region region, @NotNull Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @NotNull
    public static final Region l(@NotNull Region region, @NotNull Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @NotNull
    public static final Region m(@NotNull Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final Region n(@NotNull Region region, @NotNull Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @NotNull
    public static final Region o(@NotNull Region region, @NotNull Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
