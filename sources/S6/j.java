package s6;

import B0.C0920d;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.core.app.C2379b;
import c6.C2947b;
import com.prism.commons.utils.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f238586d = l0.b(j.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5577b[] f238587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f238588b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f238589c;

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f238591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f238592b;

        public b(Activity activity, List list) {
            this.f238591a = activity;
            this.f238592b = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            j.d(this.f238591a, this.f238592b, j.this.f238588b);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            e eVar = j.this.f238589c;
            j jVar = j.this;
            eVar.a(jVar.f238588b, jVar);
        }
    }

    public interface e {
        void a(int i10, j jVar);

        void b(int i10, j jVar);

        void c(int i10, j jVar, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public j(C5577b[] c5577bArr) {
        this.f238587a = c5577bArr;
    }

    public static void d(Activity activity, List<C5577b> list, int i10) {
        Log.d(f238586d, "doRequestPermissions act:" + activity + " req:" + list.size());
        String[] strArr = new String[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            strArr[i11] = list.get(i11).c();
        }
        C2379b.l(activity, strArr, i10);
    }

    public void e(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i11 = this.f238588b;
        if (i11 < 0 || i11 != i10) {
            return;
        }
        int length = iArr.length;
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            if (iArr[i12] != 0) {
                z10 = true;
                break;
            }
            i12++;
        }
        Log.d(f238586d, "onRequestPermissionResult hasDenied:" + z10 + " callback:" + this.f238589c);
        e eVar = this.f238589c;
        if (eVar != null) {
            if (z10) {
                eVar.c(i10, this, strArr, iArr);
            } else {
                eVar.b(i10, this);
            }
        }
    }

    public void f(Activity activity, int i10, e eVar) {
        this.f238588b = i10;
        this.f238589c = eVar;
        Log.d(f238586d, "requestPermission act:" + activity + " req:" + this.f238587a.length);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (C5577b c5577b : this.f238587a) {
            if (C0920d.checkSelfPermission(activity, c5577b.c()) != 0) {
                arrayList.add(c5577b);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C5577b c5577b2 = (C5577b) obj;
            if (C2379b.r(activity, c5577b2.c())) {
                arrayList2.add(c5577b2);
            }
        }
        Log.d(f238586d, "requestPermission notGranted(" + arrayList.size() + ") shouldExplain(" + arrayList2.size() + ")");
        if (arrayList2.size() > 0) {
            g(activity, arrayList2, arrayList);
        } else if (arrayList.size() > 0) {
            d(activity, arrayList, i10);
        } else {
            eVar.b(i10, this);
        }
    }

    public final void g(Activity activity, List<C5577b> list, List<C5577b> list2) {
        boolean z10;
        C5578c c5578c = new C5578c(activity, 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(C2947b.m.f129553Q);
        Iterator<C5577b> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (it.next().f()) {
                z10 = true;
                break;
            }
        }
        c5578c.addAll(list);
        builder.setAdapter(c5578c, new a());
        builder.setPositiveButton(C2947b.m.f129550P, new b(activity, list2));
        if (!z10) {
            builder.setNegativeButton(C2947b.m.f129547O, new c());
        }
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.getListView().setOnItemClickListener(new d());
        alertDialogCreate.show();
    }

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    public class d implements AdapterView.OnItemClickListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        }
    }
}
