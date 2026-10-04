package Y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f79101f = "LocalBroadcastManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f79102g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f79103h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f79104i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a f79105j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f79106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f79107b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f79108c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f79109d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f79110e;

    /* JADX INFO: renamed from: Y1.a$a, reason: collision with other inner class name */
    public class HandlerC0144a extends Handler {
        public HandlerC0144a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f79112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f79113b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f79112a = intent;
            this.f79113b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f79114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f79115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f79116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f79117d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f79114a = intentFilter;
            this.f79115b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f79115b);
            sb2.append(" filter=");
            sb2.append(this.f79114a);
            if (this.f79117d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f79106a = context;
        this.f79110e = new HandlerC0144a(context.getMainLooper());
    }

    @NonNull
    public static a b(@NonNull Context context) {
        a aVar;
        synchronized (f79104i) {
            try {
                if (f79105j == null) {
                    f79105j = new a(context.getApplicationContext());
                }
                aVar = f79105j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f79107b) {
                try {
                    size = this.f79109d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f79109d.toArray(bVarArr);
                    this.f79109d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f79113b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f79113b.get(i11);
                    if (!cVar.f79117d) {
                        cVar.f79115b.onReceive(this.f79106a, bVar.f79112a);
                    }
                }
            }
        }
    }

    public void c(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f79107b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f79107b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f79107b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f79108c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f79108c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(@NonNull Intent intent) {
        ArrayList<c> arrayList;
        synchronized (this.f79107b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f79106a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v(f79101f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList2 = this.f79108c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z10) {
                        Log.v(f79101f, "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        c cVar = arrayList2.get(i10);
                        if (z10) {
                            Log.v(f79101f, "Matching against filter " + cVar.f79114a);
                        }
                        if (cVar.f79116c) {
                            if (z10) {
                                Log.v(f79101f, "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = cVar.f79114a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f79101f);
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    Log.v(f79101f, sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cVar);
                                cVar.f79116c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z10) {
                                    Log.v(f79101f, "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i10++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            ((c) arrayList3.get(i11)).f79116c = false;
                        }
                        this.f79109d.add(new b(intent, arrayList3));
                        if (!this.f79110e.hasMessages(1)) {
                            this.f79110e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(@NonNull Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f79107b) {
            try {
                ArrayList<c> arrayListRemove = this.f79107b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f79117d = true;
                    for (int i10 = 0; i10 < cVar.f79114a.countActions(); i10++) {
                        String action = cVar.f79114a.getAction(i10);
                        ArrayList<c> arrayList = this.f79108c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f79115b == broadcastReceiver) {
                                    cVar2.f79117d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f79108c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
