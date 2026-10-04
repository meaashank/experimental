package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* JADX INFO: renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3615kb extends V7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f153095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3615kb(Context context) {
        super(context, (byte) 1);
        kotlin.jvm.internal.G.p(context, "context");
    }

    @Override // com.inmobi.media.V7
    public final void a(C3708r7 scrollableContainerAsset, W7 dataSource, int i10, int i11, U7 u72) {
        kotlin.jvm.internal.G.p(scrollableContainerAsset, "scrollableContainerAsset");
        kotlin.jvm.internal.G.p(dataSource, "dataSource");
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        this.f153095b = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(dataSource instanceof NativeRecyclerViewAdapter ? (NativeRecyclerViewAdapter) dataSource : null);
        addView(this.f153095b);
    }
}
