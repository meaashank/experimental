package x8;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.prism.gaia.client.stub.ResolverActivity;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BottomSheetDialog f240530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f240531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GridView f240532c;

    public BottomSheetDialog a() {
        return this.f240530a;
    }

    public ListAdapter b() {
        return this.f240531b;
    }

    public GridView c() {
        return this.f240532c;
    }

    public void d(Context context, ListAdapter listAdapter, ResolverActivity.c cVar, AdapterView.OnItemClickListener onItemClickListener) {
        GridView gridView = new GridView(context);
        this.f240532c = gridView;
        gridView.setNumColumns(3);
        this.f240531b = listAdapter;
        this.f240532c.setAdapter(listAdapter);
        this.f240532c.setOnItemClickListener(onItemClickListener);
        this.f240532c.setOnItemLongClickListener(cVar);
        this.f240530a = C5797a.c(context, this.f240532c, true, true);
    }

    public void e() {
        this.f240530a.dismiss();
    }
}
