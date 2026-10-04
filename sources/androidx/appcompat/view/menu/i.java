package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.o;
import androidx.core.view.C2462i0;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
public class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f85621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlertDialog f85622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f85623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o.a f85624d;

    public i(h hVar) {
        this.f85621a = hVar;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a(@NonNull h hVar) {
        o.a aVar = this.f85624d;
        if (aVar != null) {
            return aVar.a(hVar);
        }
        return false;
    }

    public void b() {
        AlertDialog alertDialog = this.f85622b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void c(o.a aVar) {
        this.f85624d = aVar;
    }

    public void d(IBinder iBinder) {
        h hVar = this.f85621a;
        AlertDialog.Builder builder = new AlertDialog.Builder(hVar.getContext());
        f fVar = new f(builder.getContext(), C4426a.j.f201361q);
        this.f85623c = fVar;
        fVar.f85610h = this;
        this.f85621a.addMenuPresenter(fVar);
        builder.setAdapter(this.f85623c.a(), this);
        View headerView = hVar.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        } else {
            builder.setIcon(hVar.getHeaderIcon()).setTitle(hVar.getHeaderTitle());
        }
        builder.setOnKeyListener(this);
        AlertDialog alertDialogCreate = builder.create();
        this.f85622b = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f85622b.getWindow().getAttributes();
        attributes.type = C2462i0.f111917f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f85622b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f85621a.performItemAction((k) this.f85623c.a().getItem(i10), 0);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void onCloseMenu(@NonNull h hVar, boolean z10) {
        if (z10 || hVar == this.f85621a) {
            b();
        }
        o.a aVar = this.f85624d;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f85623c.onCloseMenu(this.f85621a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f85622b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f85622b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f85621a.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f85621a.performShortcut(i10, keyEvent, 0);
    }
}
