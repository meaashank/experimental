package l5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ahmadaghazadeh.editor.keyboard.ExtendedKeyboard;
import java.util.List;
import k5.b;

/* JADX INFO: renamed from: l5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5148c extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<C5146a> f220949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtendedKeyboard.a f220950e;

    /* JADX INFO: renamed from: l5.c$a */
    public static class a extends RecyclerView.C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f220951b;

        public a(View view) {
            super(view);
            this.f220951b = (TextView) view.findViewById(b.j.f215599K1);
        }
    }

    public static /* synthetic */ void h(C5148c c5148c, C5146a c5146a, View view) {
        ExtendedKeyboard.a aVar = c5148c.f220950e;
        if (aVar != null) {
            aVar.a(view, c5146a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f220949d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        final C5146a c5146a = this.f220949d.get(i10);
        aVar.f220951b.setText(c5146a.b());
        aVar.f220951b.setOnClickListener(new View.OnClickListener() { // from class: l5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5148c.h(this.f220947a, c5146a, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(b.m.f215765Q, viewGroup, false));
    }

    public void k(List<C5146a> list) {
        this.f220949d = list;
    }

    public void l(ExtendedKeyboard.a aVar) {
        this.f220950e = aVar;
    }
}
