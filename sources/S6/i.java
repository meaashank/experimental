package s6;

import B0.C0920d;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC1486c;
import androidx.core.app.C2379b;
import c6.C2947b;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import d.C4283b;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f238581e = l0.b(i.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.activity.result.g<String[]> f238582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f238583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f238584c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f238585d = true;

    public interface b {
        void a(i iVar);

        void b(i iVar);

        void c(i iVar, @NonNull String[] strArr);
    }

    public i(@NonNull ActivityC1486c activityC1486c) {
        this.f238582a = activityC1486c.registerForActivityResult(new C4283b.k(), new androidx.activity.result.a() { // from class: s6.d
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                this.f238577a.f((Map) obj);
            }
        });
    }

    public static /* synthetic */ void b(AdapterView adapterView, View view, int i10, long j10) {
    }

    public static /* synthetic */ void d(DialogInterface dialogInterface, int i10) {
    }

    public final void e(@NonNull List<C5577b> list) {
        if (this.f238582a == null) {
            b bVar = this.f238583b;
            if (bVar != null) {
                bVar.b(this);
                return;
            }
            return;
        }
        if (list.size() == 0) {
            b bVar2 = this.f238583b;
            if (bVar2 != null) {
                bVar2.a(this);
                return;
            }
            return;
        }
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).c();
        }
        this.f238582a.b(strArr);
    }

    public void f(Map<String, Boolean> map) {
        if (this.f238583b == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue().booleanValue()) {
                linkedList.add(entry.getKey());
            }
        }
        if (linkedList.size() == 0) {
            this.f238583b.a(this);
        } else {
            this.f238583b.c(this, (String[]) linkedList.toArray(new String[0]));
        }
    }

    public final /* synthetic */ void h(List list, DialogInterface dialogInterface, int i10) {
        e(list);
    }

    public final /* synthetic */ void i(DialogInterface dialogInterface, int i10) {
        b bVar = this.f238583b;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public void k(@NonNull Activity activity, C5577b[] c5577bArr, b bVar) {
        if (c5577bArr == null) {
            c5577bArr = new C5577b[0];
        }
        this.f238583b = bVar;
        if (!this.f238584c) {
            l(activity, Arrays.asList(c5577bArr));
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (C5577b c5577b : c5577bArr) {
            if (C0920d.checkSelfPermission(activity, c5577b.c()) != 0) {
                linkedList.add(c5577b);
            }
        }
        l(activity, linkedList);
    }

    public final void l(@NonNull Activity activity, @NonNull final List<C5577b> list) {
        if (!this.f238585d) {
            e(list);
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (C5577b c5577b : list) {
            if (C5577b.e() || C2379b.r(activity, c5577b.c())) {
                linkedList.add(c5577b);
            }
        }
        I.b(f238581e, "shouldExplain.size = %d", Integer.valueOf(linkedList.size()));
        if (linkedList.size() == 0) {
            e(list);
            return;
        }
        C5578c c5578c = new C5578c(activity, 0);
        c5578c.addAll(linkedList);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C2947b.n.f130442yb);
        builder.setAdapter(c5578c, new e());
        builder.setTitle(C2947b.m.f129553Q);
        builder.setPositiveButton(C2947b.m.f129550P, new DialogInterface.OnClickListener() { // from class: s6.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f238578a.e(list);
            }
        });
        builder.setNegativeButton(C2947b.m.f129547O, new DialogInterface.OnClickListener() { // from class: s6.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f238580a.i(dialogInterface, i10);
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.getListView().setOnItemClickListener(new h());
        alertDialogCreate.show();
    }

    public i m(boolean z10) {
        this.f238584c = z10;
        return this;
    }

    public i n(boolean z10) {
        this.f238585d = z10;
        return this;
    }

    public i(androidx.activity.result.g<String[]> gVar) {
        this.f238582a = gVar;
    }

    public static abstract class a implements b {
        @Override // s6.i.b
        public void b(i iVar) {
        }

        @Override // s6.i.b
        public void c(i iVar, @NonNull String[] strArr) {
        }
    }

    public static /* synthetic */ void g(DialogInterface dialogInterface, int i10) {
    }

    public static /* synthetic */ void j(AdapterView adapterView, View view, int i10, long j10) {
    }
}
