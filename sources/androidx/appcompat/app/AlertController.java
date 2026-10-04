package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C2507z0;
import androidx.core.widget.NestedScrollView;
import g.C4426a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f85096A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f85098C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f85099D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f85100E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f85101F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f85102G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f85103H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f85105J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f85106K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f85107L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f85108M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f85109N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f85110O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f85111P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Handler f85113R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f85116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f85117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f85119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f85120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f85121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f85122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85127m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f85129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f85130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f85131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f85132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f85133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f85134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f85135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f85136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f85137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f85138x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f85139y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f85140z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85128n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f85097B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f85104I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f85112Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f85114S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85142b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f85141a, getPaddingRight(), z11 ? getPaddingBottom() : this.f85142b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4426a.m.f201939Y4);
            this.f85142b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C4426a.m.f201947Z4, -1);
            this.f85141a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C4426a.m.f201956a5, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f85129o || (message3 = alertController.f85131q) == null) ? (view != alertController.f85133s || (message2 = alertController.f85135u) == null) ? (view != alertController.f85137w || (message = alertController.f85139y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f85113R.obtainMessage(1, alertController2.f85116b).sendToTarget();
        }
    }

    public class b implements NestedScrollView.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f85144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f85145b;

        public b(View view, View view2) {
            this.f85144a = view;
            this.f85145b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f85144a, this.f85145b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f85147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f85148b;

        public c(View view, View view2) {
            this.f85147a = view;
            this.f85148b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f85096A, this.f85147a, this.f85148b);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f85150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f85151b;

        public d(View view, View view2) {
            this.f85150a = view;
            this.f85151b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f85150a, this.f85151b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f85153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f85154b;

        public e(View view, View view2) {
            this.f85153a = view;
            this.f85154b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f85121g, this.f85153a, this.f85154b);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f85156A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f85157B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f85158C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f85159D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f85161F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f85162G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f85163H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f85165J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f85166K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f85167L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f85168M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public boolean f85169N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f85170O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public e f85171P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f85173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f85174b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f85176d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f85178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f85179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f85180h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f85181i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f85182j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f85183k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f85184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f85185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f85186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f85187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f85188p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f85189q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f85191s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f85192t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f85193u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f85194v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f85195w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f85196x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f85197y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f85198z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85175c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f85177e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f85160E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f85164I = -1;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public boolean f85172Q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f85190r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f85199a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f85199a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.f85161F;
                if (zArr != null && zArr[i10]) {
                    this.f85199a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f85201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f85202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f85203c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f85204d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f85203c = recycleListView;
                this.f85204d = alertController;
                Cursor cursor2 = getCursor();
                this.f85201a = cursor2.getColumnIndexOrThrow(f.this.f85167L);
                this.f85202b = cursor2.getColumnIndexOrThrow(f.this.f85168M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f85201a));
                this.f85203c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f85202b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f85174b.inflate(this.f85204d.f85108M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f85206a;

            public c(AlertController alertController) {
                this.f85206a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f85196x.onClick(this.f85206a.f85116b, i10);
                if (f.this.f85163H) {
                    return;
                }
                this.f85206a.f85116b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f85208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f85209b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f85208a = recycleListView;
                this.f85209b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.f85161F;
                if (zArr != null) {
                    zArr[i10] = this.f85208a.isItemChecked(i10);
                }
                f.this.f85165J.onClick(this.f85209b.f85116b, i10, this.f85208a.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f85173a = context;
            this.f85174b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f85179g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f85178f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f85176d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i10 = this.f85175c;
                if (i10 != 0) {
                    alertController.o(i10);
                }
                int i11 = this.f85177e;
                if (i11 != 0) {
                    alertController.o(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f85180h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f85181i;
            if (charSequence3 == null && this.f85182j == null) {
                alertController2 = alertController;
            } else {
                alertController.l(-1, charSequence3, this.f85183k, null, this.f85182j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f85184l;
            if (charSequence4 != null || this.f85185m != null) {
                alertController2.l(-2, charSequence4, this.f85186n, null, this.f85185m);
            }
            CharSequence charSequence5 = this.f85187o;
            if (charSequence5 != null || this.f85188p != null) {
                alertController2.l(-3, charSequence5, this.f85189q, null, this.f85188p);
            }
            if (this.f85194v != null || this.f85166K != null || this.f85195w != null) {
                b(alertController2);
            }
            View view2 = this.f85198z;
            if (view2 != null) {
                if (this.f85160E) {
                    alertController2.v(view2, this.f85156A, this.f85157B, this.f85158C, this.f85159D);
                    return;
                } else {
                    alertController2.u(view2);
                    return;
                }
            }
            int i12 = this.f85197y;
            if (i12 != 0) {
                alertController2.t(i12);
            }
        }

        public final void b(AlertController alertController) {
            f fVar;
            AlertController alertController2;
            ListAdapter hVar;
            RecycleListView recycleListView = (RecycleListView) this.f85174b.inflate(alertController.f85107L, (ViewGroup) null);
            if (!this.f85162G) {
                fVar = this;
                alertController2 = alertController;
                int i10 = fVar.f85163H ? alertController2.f85109N : alertController2.f85110O;
                if (fVar.f85166K != null) {
                    hVar = new SimpleCursorAdapter(fVar.f85173a, i10, fVar.f85166K, new String[]{fVar.f85167L}, new int[]{R.id.text1});
                } else {
                    hVar = fVar.f85195w;
                    if (hVar == null) {
                        hVar = new h(fVar.f85173a, i10, R.id.text1, (Object[]) fVar.f85194v);
                    }
                }
            } else if (this.f85166K == null) {
                fVar = this;
                hVar = fVar.new a(this.f85173a, alertController.f85108M, R.id.text1, this.f85194v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                fVar = this;
                alertController2 = alertController;
                hVar = fVar.new b(fVar.f85173a, fVar.f85166K, false, recycleListView, alertController2);
            }
            e eVar = fVar.f85171P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController2.f85103H = hVar;
            alertController2.f85104I = fVar.f85164I;
            if (fVar.f85196x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (fVar.f85165J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = fVar.f85170O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (fVar.f85163H) {
                recycleListView.setChoiceMode(1);
            } else if (fVar.f85162G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f85121g = recycleListView;
        }
    }

    public static final class g extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f85211b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f85212a;

        public g(DialogInterface dialogInterface) {
            this.f85212a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f85212a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, w wVar, Window window) {
        this.f85115a = context;
        this.f85116b = wVar;
        this.f85117c = window;
        this.f85113R = new g(wVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4426a.m.f201894T, C4426a.b.f200765M, 0);
        this.f85105J = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201902U, 0);
        this.f85106K = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201918W, 0);
        this.f85107L = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201934Y, 0);
        this.f85108M = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201942Z, 0);
        this.f85109N = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201960b0, 0);
        this.f85110O = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201926X, 0);
        this.f85111P = typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f201951a0, true);
        this.f85118d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4426a.m.f201910V, 0);
        typedArrayObtainStyledAttributes.recycle();
        wVar.supportRequestWindowFeature(1);
    }

    public static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4426a.b.f200760L, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        ListAdapter listAdapter;
        View viewFindViewById;
        View viewFindViewById2 = this.f85117c.findViewById(C4426a.g.f201264O);
        int i10 = C4426a.g.f201319v0;
        View viewFindViewById3 = viewFindViewById2.findViewById(i10);
        int i11 = C4426a.g.f201316u;
        View viewFindViewById4 = viewFindViewById2.findViewById(i11);
        int i12 = C4426a.g.f201308q;
        View viewFindViewById5 = viewFindViewById2.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(C4426a.g.f201320w);
        y(viewGroup);
        View viewFindViewById6 = viewGroup.findViewById(i10);
        View viewFindViewById7 = viewGroup.findViewById(i11);
        View viewFindViewById8 = viewGroup.findViewById(i12);
        ViewGroup viewGroupJ = j(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupJ2 = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ3 = j(viewFindViewById8, viewFindViewById5);
        x(viewGroupJ2);
        w(viewGroupJ3);
        z(viewGroupJ);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupJ3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupJ2.findViewById(C4426a.g.f201309q0)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f85096A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f85120f == null && this.f85121g == null) ? null : viewGroupJ.findViewById(C4426a.g.f201315t0);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupJ2.findViewById(C4426a.g.f201311r0);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        ListView listView = this.f85121g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f85121g;
            if (view == null) {
                view = this.f85096A;
            }
            if (view != null) {
                r(viewGroupJ2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f85121g;
        if (listView2 == null || (listAdapter = this.f85103H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f85104I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f85137w;
        }
        if (i10 == -2) {
            return this.f85133s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f85129o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f85115a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f85121g;
    }

    public void f() {
        this.f85116b.setContentView(k());
        A();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f85096A;
        return nestedScrollView != null && nestedScrollView.l(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f85096A;
        return nestedScrollView != null && nestedScrollView.l(keyEvent);
    }

    @Nullable
    public final ViewGroup j(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i10 = this.f85106K;
        return i10 == 0 ? this.f85105J : this.f85112Q == 1 ? i10 : this.f85105J;
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f85113R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f85138x = charSequence;
            this.f85139y = message;
            this.f85140z = drawable;
        } else if (i10 == -2) {
            this.f85134t = charSequence;
            this.f85135u = message;
            this.f85136v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f85130p = charSequence;
            this.f85131q = message;
            this.f85132r = drawable;
        }
    }

    public void m(int i10) {
        this.f85112Q = i10;
    }

    public void n(View view) {
        this.f85102G = view;
    }

    public void o(int i10) {
        this.f85098C = null;
        this.f85097B = i10;
        ImageView imageView = this.f85099D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f85099D.setImageResource(this.f85097B);
            }
        }
    }

    public void p(Drawable drawable) {
        this.f85098C = drawable;
        this.f85097B = 0;
        ImageView imageView = this.f85099D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f85099D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f85120f = charSequence;
        TextView textView = this.f85101F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void r(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f85117c.findViewById(C4426a.g.f201270U);
        View viewFindViewById2 = this.f85117c.findViewById(C4426a.g.f201269T);
        C2507z0.y2(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void s(CharSequence charSequence) {
        this.f85119e = charSequence;
        TextView textView = this.f85100E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i10) {
        this.f85122h = null;
        this.f85123i = i10;
        this.f85128n = false;
    }

    public void u(View view) {
        this.f85122h = view;
        this.f85123i = 0;
        this.f85128n = false;
    }

    public void v(View view, int i10, int i11, int i12, int i13) {
        this.f85122h = view;
        this.f85123i = 0;
        this.f85128n = true;
        this.f85124j = i10;
        this.f85125k = i11;
        this.f85126l = i12;
        this.f85127m = i13;
    }

    public final void w(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f85129o = button;
        button.setOnClickListener(this.f85114S);
        if (TextUtils.isEmpty(this.f85130p) && this.f85132r == null) {
            this.f85129o.setVisibility(8);
            i10 = 0;
        } else {
            this.f85129o.setText(this.f85130p);
            Drawable drawable = this.f85132r;
            if (drawable != null) {
                int i11 = this.f85118d;
                drawable.setBounds(0, 0, i11, i11);
                this.f85129o.setCompoundDrawables(this.f85132r, null, null, null);
            }
            this.f85129o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f85133s = button2;
        button2.setOnClickListener(this.f85114S);
        if (TextUtils.isEmpty(this.f85134t) && this.f85136v == null) {
            this.f85133s.setVisibility(8);
        } else {
            this.f85133s.setText(this.f85134t);
            Drawable drawable2 = this.f85136v;
            if (drawable2 != null) {
                int i12 = this.f85118d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f85133s.setCompoundDrawables(this.f85136v, null, null, null);
            }
            this.f85133s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f85137w = button3;
        button3.setOnClickListener(this.f85114S);
        if (TextUtils.isEmpty(this.f85138x) && this.f85140z == null) {
            this.f85137w.setVisibility(8);
        } else {
            this.f85137w.setText(this.f85138x);
            Drawable drawable3 = this.f85140z;
            if (drawable3 != null) {
                int i13 = this.f85118d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f85137w.setCompoundDrawables(this.f85140z, null, null, null);
            }
            this.f85137w.setVisibility(0);
            i10 |= 4;
        }
        if (B(this.f85115a)) {
            if (i10 == 1) {
                b(this.f85129o);
            } else if (i10 == 2) {
                b(this.f85133s);
            } else if (i10 == 4) {
                b(this.f85137w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f85117c.findViewById(C4426a.g.f201271V);
        this.f85096A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f85096A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f85101F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f85120f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f85096A.removeView(this.f85101F);
        if (this.f85121g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f85096A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f85096A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f85121g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void y(ViewGroup viewGroup) {
        View viewInflate = this.f85122h;
        if (viewInflate == null) {
            viewInflate = this.f85123i != 0 ? LayoutInflater.from(this.f85115a).inflate(this.f85123i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f85117c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f85117c.findViewById(C4426a.g.f201318v);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f85128n) {
            frameLayout.setPadding(this.f85124j, this.f85125k, this.f85126l, this.f85127m);
        }
        if (this.f85121g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void z(ViewGroup viewGroup) {
        if (this.f85102G != null) {
            viewGroup.addView(this.f85102G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f85117c.findViewById(C4426a.g.f201317u0).setVisibility(8);
            return;
        }
        this.f85099D = (ImageView) this.f85117c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f85119e) || !this.f85111P) {
            this.f85117c.findViewById(C4426a.g.f201317u0).setVisibility(8);
            this.f85099D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f85117c.findViewById(C4426a.g.f201306p);
        this.f85100E = textView;
        textView.setText(this.f85119e);
        int i10 = this.f85097B;
        if (i10 != 0) {
            this.f85099D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f85098C;
        if (drawable != null) {
            this.f85099D.setImageDrawable(drawable);
        } else {
            this.f85100E.setPadding(this.f85099D.getPaddingLeft(), this.f85099D.getPaddingTop(), this.f85099D.getPaddingRight(), this.f85099D.getPaddingBottom());
            this.f85099D.setVisibility(8);
        }
    }
}
