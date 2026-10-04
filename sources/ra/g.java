package ra;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import c6.C2947b;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.compat.PfsCompatType;
import o6.InterfaceC5331d;
import ra.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g implements PrivateFileSystem.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f227275a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f227276a;

        static {
            int[] iArr = new int[PfsCompatType.values().length];
            f227276a = iArr;
            try {
                iArr[PfsCompatType.SAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f227276a[PfsCompatType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(Context context) {
        this.f227275a = context;
    }

    public static /* synthetic */ void d(InterfaceC5331d interfaceC5331d, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        interfaceC5331d.stop();
    }

    @Override // com.prism.lib.pfs.PrivateFileSystem.d
    public void b(PfsCompatType pfsCompatType, String str, final InterfaceC5331d interfaceC5331d) {
        if (a.f227276a[pfsCompatType.ordinal()] != 1) {
            interfaceC5331d.a();
        } else {
            new AlertDialog.Builder(this.f227275a).setMessage(this.f227275a.getString(i.p.f230836i4, str)).setPositiveButton(C2947b.m.f129670v2, new DialogInterface.OnClickListener() { // from class: ra.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    interfaceC5331d.a();
                }
            }).setNegativeButton(C2947b.m.f129666u2, new DialogInterface.OnClickListener() { // from class: ra.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    g.d(interfaceC5331d, dialogInterface, i10);
                }
            }).create().show();
        }
    }
}
