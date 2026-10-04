package u;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import e.f0;
import java.util.ArrayList;
import java.util.List;
import s7.C5579a;
import t.C5594a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f239298f = "BrowserActionskMenuUi";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f239299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f239300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<C5630a> f239301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC0890d f239302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public DialogC5632c f239303e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) d.this.f239299a.getSystemService(C5579a.f238596f)).setPrimaryClip(ClipData.newPlainText("url", d.this.f239300b.toString()));
            Toast.makeText(d.this.f239299a, d.this.f239299a.getString(C5594a.e.f238636a), 0).show();
        }
    }

    public class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f239305a;

        public b(View view) {
            this.f239305a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            InterfaceC0890d interfaceC0890d = d.this.f239302d;
            if (interfaceC0890d == null) {
                Log.e(d.f239298f, "Cannot trigger menu item listener, it is null");
            } else {
                interfaceC0890d.a(this.f239305a);
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f239307a;

        public c(TextView textView) {
            this.f239307a = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f239307a.getMaxLines() == Integer.MAX_VALUE) {
                this.f239307a.setMaxLines(1);
                this.f239307a.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f239307a.setMaxLines(Integer.MAX_VALUE);
                this.f239307a.setEllipsize(null);
            }
        }
    }

    /* JADX INFO: renamed from: u.d$d, reason: collision with other inner class name */
    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0890d {
        void a(View view);
    }

    public d(@NonNull Context context, @NonNull Uri uri, @NonNull List<C5630a> list) {
        this.f239299a = context;
        this.f239300b = uri;
        this.f239301c = b(list);
    }

    public final Runnable a() {
        return new a();
    }

    @NonNull
    public final List<C5630a> b(List<C5630a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5630a(this.f239299a.getString(C5594a.e.f238638c), c(), 0));
        arrayList.add(new C5630a(this.f239299a.getString(C5594a.e.f238637b), new a()));
        arrayList.add(new C5630a(this.f239299a.getString(C5594a.e.f238639d), d(), 0));
        arrayList.addAll(list);
        return arrayList;
    }

    public final PendingIntent c() {
        return PendingIntent.getActivity(this.f239299a, 0, new Intent("android.intent.action.VIEW", this.f239300b), 67108864);
    }

    public final PendingIntent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f239300b.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f239299a, 0, intent, 67108864);
    }

    public void e() {
        View viewInflate = LayoutInflater.from(this.f239299a).inflate(C5594a.d.f238634a, (ViewGroup) null);
        DialogC5632c dialogC5632c = new DialogC5632c(this.f239299a, f(viewInflate));
        this.f239303e = dialogC5632c;
        dialogC5632c.setContentView(viewInflate);
        if (this.f239302d != null) {
            this.f239303e.setOnShowListener(new b(viewInflate));
        }
        this.f239303e.show();
    }

    public final BrowserActionsFallbackMenuView f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(C5594a.c.f238633e);
        TextView textView = (TextView) view.findViewById(C5594a.c.f238629a);
        textView.setText(this.f239300b.toString());
        textView.setOnClickListener(new c(textView));
        ListView listView = (ListView) view.findViewById(C5594a.c.f238632d);
        listView.setAdapter((ListAdapter) new C5631b(this.f239301c, this.f239299a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void g(@Nullable InterfaceC0890d interfaceC0890d) {
        this.f239302d = interfaceC0890d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        C5630a c5630a = this.f239301c.get(i10);
        if (c5630a.a() != null) {
            try {
                c5630a.a().send();
            } catch (PendingIntent.CanceledException e10) {
                Log.e(f239298f, "Failed to send custom item action", e10);
            }
        } else if (c5630a.d() != null) {
            c5630a.d().run();
        }
        DialogC5632c dialogC5632c = this.f239303e;
        if (dialogC5632c == null) {
            Log.e(f239298f, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            dialogC5632c.dismiss();
        }
    }
}
