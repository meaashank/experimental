package androidx.core.app;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import com.bumptech.glide.load.engine.GlideException;
import e.InterfaceC4337k;
import e.InterfaceC4342p;
import e.InterfaceC4343q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y0.C5809a;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";

    @InterfaceC4337k
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class Action {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f110758m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f110759n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f110760o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f110761p = 3;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f110762q = 4;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f110763r = 5;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f110764s = 6;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f110765t = 7;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f110766u = 8;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f110767v = 9;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f110768w = 10;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f110769x = "android.support.action.showsUserInterface";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f110770y = "android.support.action.semanticAction";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f110771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public IconCompat f110772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RemoteInput[] f110773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final RemoteInput[] f110774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f110775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f110776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f110777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f110778h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f110779i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f110780j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public PendingIntent f110781k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f110782l;

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            @e.T(20)
            public static class a {
                private a() {
                }

                public static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                public static android.app.RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            @e.T(23)
            public static class b {
                private b() {
                }

                public static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            @e.T(24)
            public static class c {
                private c() {
                }

                public static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            @e.T(28)
            public static class d {
                private d() {
                }

                public static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            @e.T(29)
            public static class e {
                private e() {
                }

                public static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            @e.T(31)
            public static class f {
                private f() {
                }

                public static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @NonNull
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action action) {
                Builder builder = b.a(action) != null ? new Builder(IconCompat.m(b.a(action)), action.title, action.actionIntent) : new Builder(action.icon, action.title, action.actionIntent);
                android.app.RemoteInput[] remoteInputArrB = a.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    for (android.app.RemoteInput remoteInput : remoteInputArrB) {
                        builder.addRemoteInput(RemoteInput.a.c(remoteInput));
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    builder.mAllowGeneratedReplies = c.a(action);
                }
                if (i10 >= 28) {
                    builder.setSemanticAction(d.a(action));
                }
                if (i10 >= 29) {
                    builder.setContextual(e.a(action));
                }
                if (i10 >= 31) {
                    builder.setAuthenticationRequired(f.a(action));
                }
                builder.addExtras(a.a(action));
                return builder;
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            @NonNull
            public Action build() {
                checkContextualActionNullFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        RemoteInput remoteInput = arrayList3.get(i10);
                        i10++;
                        RemoteInput remoteInput2 = remoteInput;
                        if (remoteInput2.r()) {
                            arrayList.add(remoteInput2);
                        } else {
                            arrayList2.add(remoteInput2);
                        }
                    }
                }
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mAuthenticationRequired);
            }

            @NonNull
            public Builder extend(@NonNull a aVar) {
                aVar.a(this);
                return this;
            }

            @NonNull
            public Bundle getExtras() {
                return this.mExtras;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z10) {
                this.mAllowGeneratedReplies = z10;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z10) {
                this.mAuthenticationRequired = z10;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z10) {
                this.mIsContextual = z10;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int i10) {
                this.mSemanticAction = i10;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z10) {
                this.mShowsUserInterface = z10;
                return this;
            }

            public Builder(int i10, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action action) {
                this(action.f(), action.f110780j, action.f110781k, new Bundle(action.f110771a), action.g(), action.b(), action.h(), action.f110776f, action.l(), action.k());
            }

            private Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @NonNull Bundle bundle, @Nullable RemoteInput[] remoteInputArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.mAllowGeneratedReplies = z10;
                this.mSemanticAction = i10;
                this.mShowsUserInterface = z11;
                this.mIsContextual = z12;
                this.mAuthenticationRequired = z13;
            }
        }

        public interface a {
            @NonNull
            Builder a(@NonNull Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public Action(int i10, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent);
        }

        @Nullable
        public PendingIntent a() {
            return this.f110781k;
        }

        public boolean b() {
            return this.f110775e;
        }

        @Nullable
        public RemoteInput[] c() {
            return this.f110774d;
        }

        @NonNull
        public Bundle d() {
            return this.f110771a;
        }

        @Deprecated
        public int e() {
            return this.f110779i;
        }

        @Nullable
        public IconCompat f() {
            int i10;
            if (this.f110772b == null && (i10 = this.f110779i) != 0) {
                this.f110772b = IconCompat.w(null, "", i10);
            }
            return this.f110772b;
        }

        @Nullable
        public RemoteInput[] g() {
            return this.f110773c;
        }

        public int h() {
            return this.f110777g;
        }

        public boolean i() {
            return this.f110776f;
        }

        @Nullable
        public CharSequence j() {
            return this.f110780j;
        }

        public boolean k() {
            return this.f110782l;
        }

        public boolean l() {
            return this.f110778h;
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final String f110783e = "android.wearable.EXTENSIONS";

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final String f110784f = "flags";

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final String f110785g = "inProgressLabel";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final String f110786h = "confirmLabel";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final String f110787i = "cancelLabel";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f110788j = 1;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f110789k = 2;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f110790l = 4;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f110791m = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f110792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public CharSequence f110793b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public CharSequence f110794c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public CharSequence f110795d;

            public c() {
                this.f110792a = 1;
            }

            @Override // androidx.core.app.NotificationCompat.Action.a
            @NonNull
            public Builder a(@NonNull Builder builder) {
                Bundle bundle = new Bundle();
                int i10 = this.f110792a;
                if (i10 != 1) {
                    bundle.putInt("flags", i10);
                }
                CharSequence charSequence = this.f110793b;
                if (charSequence != null) {
                    bundle.putCharSequence(f110785g, charSequence);
                }
                CharSequence charSequence2 = this.f110794c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f110786h, charSequence2);
                }
                CharSequence charSequence3 = this.f110795d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f110787i, charSequence3);
                }
                builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
                return builder;
            }

            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c clone() {
                c cVar = new c();
                cVar.f110792a = this.f110792a;
                cVar.f110793b = this.f110793b;
                cVar.f110794c = this.f110794c;
                cVar.f110795d = this.f110795d;
                return cVar;
            }

            @Nullable
            @Deprecated
            public CharSequence c() {
                return this.f110795d;
            }

            @Nullable
            @Deprecated
            public CharSequence d() {
                return this.f110794c;
            }

            public boolean e() {
                return (this.f110792a & 4) != 0;
            }

            public boolean f() {
                return (this.f110792a & 2) != 0;
            }

            @Nullable
            @Deprecated
            public CharSequence g() {
                return this.f110793b;
            }

            public boolean h() {
                return (this.f110792a & 1) != 0;
            }

            @NonNull
            public c i(boolean z10) {
                l(1, z10);
                return this;
            }

            @NonNull
            @Deprecated
            public c j(@Nullable CharSequence charSequence) {
                this.f110795d = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public c k(@Nullable CharSequence charSequence) {
                this.f110794c = charSequence;
                return this;
            }

            public final void l(int i10, boolean z10) {
                if (z10) {
                    this.f110792a = i10 | this.f110792a;
                } else {
                    this.f110792a = (~i10) & this.f110792a;
                }
            }

            @NonNull
            public c m(boolean z10) {
                l(4, z10);
                return this;
            }

            @NonNull
            public c n(boolean z10) {
                l(2, z10);
                return this;
            }

            @NonNull
            @Deprecated
            public c o(@Nullable CharSequence charSequence) {
                this.f110793b = charSequence;
                return this;
            }

            public c(@NonNull Action action) {
                this.f110792a = 1;
                Bundle bundle = action.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f110792a = bundle.getInt("flags", 1);
                    this.f110793b = bundle.getCharSequence(f110785g);
                    this.f110794c = bundle.getCharSequence(f110786h);
                    this.f110795d = bundle.getCharSequence(f110787i);
                }
            }
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(int i10, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.w(null, "", i10) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z10, i11, z11, z12, z13);
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f110776f = true;
            this.f110772b = iconCompat;
            if (iconCompat != null && iconCompat.B() == 2) {
                this.f110779i = iconCompat.y();
            }
            this.f110780j = Builder.limitCharSequenceLength(charSequence);
            this.f110781k = pendingIntent;
            this.f110771a = bundle == null ? new Bundle() : bundle;
            this.f110773c = remoteInputArr;
            this.f110774d = remoteInputArr2;
            this.f110775e = z10;
            this.f110777g = i10;
            this.f110776f = z11;
            this.f110778h = z12;
            this.f110782l = z13;
        }
    }

    public static final class BubbleMetadata {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f110796h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f110797i = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PendingIntent f110798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PendingIntent f110799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IconCompat f110800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f110801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @InterfaceC4342p
        public int f110802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f110803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f110804g;

        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;

            @InterfaceC4342p
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            @NonNull
            private Builder setFlag(int i10, boolean z10) {
                if (z10) {
                    this.mFlags = i10 | this.mFlags;
                    return this;
                }
                this.mFlags = (~i10) & this.mFlags;
                return this;
            }

            @NonNull
            public BubbleMetadata build() {
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                PendingIntent pendingIntent = this.mPendingIntent;
                PendingIntent pendingIntent2 = this.mDeleteIntent;
                IconCompat iconCompat = this.mIcon;
                int i10 = this.mDesiredHeight;
                int i11 = this.mDesiredHeightResId;
                int i12 = this.mFlags;
                BubbleMetadata bubbleMetadata = new BubbleMetadata(pendingIntent, pendingIntent2, iconCompat, i10, i11, i12, str);
                bubbleMetadata.f110803f = i12;
                return bubbleMetadata;
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z10) {
                setFlag(1, z10);
                return this;
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setDesiredHeight(@InterfaceC4343q(unit = 0) int i10) {
                this.mDesiredHeight = Math.max(i10, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            @NonNull
            public Builder setDesiredHeightResId(@InterfaceC4342p int i10) {
                this.mDesiredHeightResId = i10;
                this.mDesiredHeight = 0;
                return this;
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.mIcon = iconCompat;
                return this;
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.mPendingIntent = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setSuppressNotification(boolean z10) {
                setFlag(2, z10);
                return this;
            }

            @e.T(30)
            public Builder(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.mShortcutId = str;
            }

            public Builder(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.mPendingIntent = pendingIntent;
                    this.mIcon = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @e.T(29)
        public static class a {
            private a() {
            }

            @Nullable
            @e.T(29)
            public static BubbleMetadata a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder suppressNotification = new Builder(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            @Nullable
            @e.T(29)
            public static Notification.BubbleMetadata b(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.f110798a == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.f110800c.J()).setIntent(bubbleMetadata.f110798a).setDeleteIntent(bubbleMetadata.f110799b).setAutoExpandBubble(bubbleMetadata.b()).setSuppressNotification(bubbleMetadata.i());
                int i10 = bubbleMetadata.f110801d;
                if (i10 != 0) {
                    suppressNotification.setDesiredHeight(i10);
                }
                int i11 = bubbleMetadata.f110802e;
                if (i11 != 0) {
                    suppressNotification.setDesiredHeightResId(i11);
                }
                return suppressNotification.build();
            }
        }

        @e.T(30)
        public static class b {
            private b() {
            }

            @Nullable
            @e.T(30)
            public static BubbleMetadata a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Builder builder = bubbleMetadata.getShortcutId() != null ? new Builder(bubbleMetadata.getShortcutId()) : new Builder(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon()));
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            @Nullable
            @e.T(30)
            public static Notification.BubbleMetadata b(@Nullable BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.f110804g != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.f110804g) : new Notification.BubbleMetadata.Builder(bubbleMetadata.f110798a, bubbleMetadata.f110800c.J());
                builder.setDeleteIntent(bubbleMetadata.f110799b).setAutoExpandBubble(bubbleMetadata.b()).setSuppressNotification(bubbleMetadata.i());
                int i10 = bubbleMetadata.f110801d;
                if (i10 != 0) {
                    builder.setDesiredHeight(i10);
                }
                int i11 = bubbleMetadata.f110802e;
                if (i11 != 0) {
                    builder.setDesiredHeightResId(i11);
                }
                return builder.build();
            }
        }

        @Nullable
        public static BubbleMetadata a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @Nullable
        public static Notification.BubbleMetadata k(@Nullable BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(bubbleMetadata);
            }
            if (i10 == 29) {
                return a.b(bubbleMetadata);
            }
            return null;
        }

        public boolean b() {
            return (this.f110803f & 1) != 0;
        }

        @Nullable
        public PendingIntent c() {
            return this.f110799b;
        }

        @InterfaceC4343q(unit = 0)
        public int d() {
            return this.f110801d;
        }

        @InterfaceC4342p
        public int e() {
            return this.f110802e;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f110800c;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f110798a;
        }

        @Nullable
        public String h() {
            return this.f110804g;
        }

        public boolean i() {
            return (this.f110803f & 2) != 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void j(int i10) {
            this.f110803f = i10;
        }

        public BubbleMetadata(@Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable IconCompat iconCompat, int i10, @InterfaceC4342p int i11, int i12, @Nullable String str) {
            this.f110798a = pendingIntent;
            this.f110800c = iconCompat;
            this.f110801d = i10;
            this.f110802e = i11;
            this.f110799b = pendingIntent2;
            this.f110803f = i12;
            this.f110804g = str;
        }
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        B0.A mLocusId;
        Notification mNotification;
        int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        u mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @e.T(21)
        public static class a {
            private a() {
            }

            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @e.T(23)
        public static class b {
            private b() {
            }

            public static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            public static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        @e.T(24)
        public static class c {
            private c() {
            }

            public static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            public static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            public static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            public static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(@NonNull Context context, @NonNull Notification notification) {
            ArrayList parcelableArrayList;
            this(context, NotificationCompat.getChannelId(notification));
            Bundle bundle = notification.extras;
            u uVarS = u.s(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(uVarS).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, uVarS));
            this.mSmallIcon = b.b(notification);
            Icon iconA = b.a(notification);
            if (iconA != null) {
                this.mLargeIcon = IconCompat.l(iconA);
            }
            Notification.Action[] actionArr = notification.actions;
            int i10 = 0;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    addPerson(Person.b.a(C.a(obj)));
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24 && bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (i11 < 26 || !bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                return;
            }
            setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
        }

        @Nullable
        private static Bundle getExtrasWithoutDuplicateData(@NonNull Notification notification, @Nullable u uVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(I.f110648d);
            bundle.remove(I.f110646b);
            bundle.remove(I.f110647c);
            bundle.remove(I.f110645a);
            bundle.remove(I.f110649e);
            Bundle bundle2 = bundle.getBundle(CarExtender.f110805d);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(CarExtender.f110809h);
                bundle.putBundle(CarExtender.f110805d, bundle3);
            }
            if (uVar != null) {
                uVar.g(bundle);
            }
            return bundle;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > MAX_CHARSEQUENCE_LENGTH) ? charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH) : charSequence;
        }

        private void setFlag(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.mNotification;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.mNotification;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        private boolean useExistingRemoteView() {
            u uVar = this.mStyle;
            return uVar == null || !uVar.r();
        }

        @NonNull
        public Builder addAction(int i10, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mActions.add(new Action(i10, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public Builder addExtras(@Nullable Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        @NonNull
        @e.T(21)
        public Builder addInvisibleAction(int i10, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new Action(i10, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addPerson(@Nullable String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        @NonNull
        public Notification build() {
            return new H(this).c();
        }

        @NonNull
        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle(CarExtender.f110805d);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(CarExtender.f110809h);
                this.mExtras.putBundle(CarExtender.f110805d, bundle2);
            }
            return this;
        }

        @NonNull
        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createBigContentView() {
            RemoteViews remoteViewsV;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            H h10 = new H(this);
            u uVar = this.mStyle;
            if (uVar != null && (remoteViewsV = uVar.v(h10)) != null) {
                return remoteViewsV;
            }
            Notification notificationC = h10.c();
            return Build.VERSION.SDK_INT >= 24 ? c.a(c.d(this.mContext, notificationC)) : notificationC.bigContentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createContentView() {
            RemoteViews remoteViewsW;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            H h10 = new H(this);
            u uVar = this.mStyle;
            if (uVar != null && (remoteViewsW = uVar.w(h10)) != null) {
                return remoteViewsW;
            }
            Notification notificationC = h10.c();
            return Build.VERSION.SDK_INT >= 24 ? c.b(c.d(this.mContext, notificationC)) : notificationC.contentView;
        }

        @Nullable
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews createHeadsUpContentView() {
            RemoteViews remoteViewsX;
            int i10 = Build.VERSION.SDK_INT;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            H h10 = new H(this);
            u uVar = this.mStyle;
            if (uVar != null && (remoteViewsX = uVar.x(h10)) != null) {
                return remoteViewsX;
            }
            Notification notificationC = h10.c();
            return i10 >= 24 ? c.c(c.d(this.mContext, notificationC)) : notificationC.headsUpContentView;
        }

        @NonNull
        public Builder extend(@NonNull n nVar) {
            nVar.a(this);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @InterfaceC4337k
        public int getColor() {
            return this.mColor;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.mContentView;
        }

        @NonNull
        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return build();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.mPriority;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z10) {
            this.mAllowSystemGeneratedContextualActions = z10;
            return this;
        }

        @NonNull
        public Builder setAutoCancel(boolean z10) {
            setFlag(16, z10);
            return this;
        }

        @NonNull
        public Builder setBadgeIconType(int i10) {
            this.mBadgeIcon = i10;
            return this;
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        @NonNull
        public Builder setCategory(@Nullable String str) {
            this.mCategory = str;
            return this;
        }

        @NonNull
        public Builder setChannelId(@NonNull String str) {
            this.mChannelId = str;
            return this;
        }

        @NonNull
        @e.T(24)
        public Builder setChronometerCountDown(boolean z10) {
            this.mChronometerCountDown = z10;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z10);
            return this;
        }

        @NonNull
        public Builder setColor(@InterfaceC4337k int i10) {
            this.mColor = i10;
            return this;
        }

        @NonNull
        public Builder setColorized(boolean z10) {
            this.mColorized = z10;
            this.mColorizedSet = true;
            return this;
        }

        @NonNull
        public Builder setContent(@Nullable RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setContentInfo(@Nullable CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentIntent(@Nullable PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setContentText(@Nullable CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setContentTitle(@Nullable CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setCustomBigContentView(@Nullable RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomContentView(@Nullable RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        @NonNull
        public Builder setDefaults(int i10) {
            Notification notification = this.mNotification;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        @NonNull
        public Builder setForegroundServiceBehavior(int i10) {
            this.mFgsDeferBehavior = i10;
            return this;
        }

        @NonNull
        public Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent, boolean z10) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z10);
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mGroupKey = str;
            return this;
        }

        @NonNull
        public Builder setGroupAlertBehavior(int i10) {
            this.mGroupAlertBehavior = i10;
            return this;
        }

        @NonNull
        public Builder setGroupSummary(boolean z10) {
            this.mGroupSummary = z10;
            return this;
        }

        @NonNull
        public Builder setLargeIcon(@Nullable Bitmap bitmap) {
            this.mLargeIcon = bitmap == null ? null : IconCompat.r(NotificationCompat.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        @NonNull
        public Builder setLights(@InterfaceC4337k int i10, int i11, int i12) {
            Notification notification = this.mNotification;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public Builder setLocalOnly(boolean z10) {
            this.mLocalOnly = z10;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable B0.A a10) {
            this.mLocusId = a10;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        @NonNull
        public Builder setNumber(int i10) {
            this.mNumber = i10;
            return this;
        }

        @NonNull
        public Builder setOngoing(boolean z10) {
            setFlag(2, z10);
            return this;
        }

        @NonNull
        public Builder setOnlyAlertOnce(boolean z10) {
            setFlag(8, z10);
            return this;
        }

        @NonNull
        public Builder setPriority(int i10) {
            this.mPriority = i10;
            return this;
        }

        @NonNull
        public Builder setProgress(int i10, int i11, boolean z10) {
            this.mProgressMax = i10;
            this.mProgress = i11;
            this.mProgressIndeterminate = z10;
            return this;
        }

        @NonNull
        public Builder setPublicVersion(@Nullable Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        @NonNull
        public Builder setRemoteInputHistory(@Nullable CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setSettingsText(@Nullable CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setShortcutId(@Nullable String str) {
            this.mShortcutId = str;
            return this;
        }

        @NonNull
        public Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat != null) {
                this.mShortcutId = shortcutInfoCompat.k();
                if (this.mLocusId == null) {
                    if (shortcutInfoCompat.o() != null) {
                        this.mLocusId = shortcutInfoCompat.o();
                    } else if (shortcutInfoCompat.k() != null) {
                        this.mLocusId = new B0.A(shortcutInfoCompat.k());
                    }
                }
                if (this.mContentTitle == null) {
                    setContentTitle(shortcutInfoCompat.w());
                }
            }
            return this;
        }

        @NonNull
        public Builder setShowWhen(boolean z10) {
            this.mShowWhen = z10;
            return this;
        }

        @NonNull
        public Builder setSilent(boolean z10) {
            this.mSilent = z10;
            return this;
        }

        @NonNull
        @e.T(23)
        public Builder setSmallIcon(@NonNull IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.K(this.mContext);
            return this;
        }

        @NonNull
        public Builder setSortKey(@Nullable String str) {
            this.mSortKey = str;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.mNotification.audioAttributes = a.a(builderE);
            return this;
        }

        @NonNull
        public Builder setStyle(@Nullable u uVar) {
            if (this.mStyle != uVar) {
                this.mStyle = uVar;
                if (uVar != null) {
                    uVar.z(this);
                }
            }
            return this;
        }

        @NonNull
        public Builder setSubText(@Nullable CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTicker(@Nullable CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public Builder setTimeoutAfter(long j10) {
            this.mTimeout = j10;
            return this;
        }

        @NonNull
        public Builder setUsesChronometer(boolean z10) {
            this.mUseChronometer = z10;
            return this;
        }

        @NonNull
        public Builder setVibrate(@Nullable long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        @NonNull
        public Builder setVisibility(int i10) {
            this.mVisibility = i10;
            return this;
        }

        @NonNull
        public Builder setWhen(long j10) {
            this.mNotification.when = j10;
            return this;
        }

        @NonNull
        public Builder addAction(@Nullable Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        @NonNull
        @e.T(21)
        public Builder addInvisibleAction(@Nullable Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i10) {
            this.mNotification.icon = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTicker(@Nullable CharSequence charSequence, @Nullable RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        @NonNull
        public Builder addPerson(@Nullable Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        @NonNull
        public Builder setSmallIcon(int i10, int i11) {
            Notification notification = this.mNotification;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        @NonNull
        @e.T(23)
        public Builder setLargeIcon(@Nullable Icon icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.l(icon);
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, int i10) {
            Notification notification = this.mNotification;
            notification.sound = uri;
            notification.audioStreamType = i10;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), i10);
            this.mNotification.audioAttributes = a.a(builderD);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        @Deprecated
        public Builder(@NonNull Context context) {
            this(context, (String) null);
        }
    }

    @e.T(20)
    public static class b {
        public static boolean a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        public static CharSequence[] b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        public static Bundle d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        public static String e(Notification notification) {
            return notification.getGroup();
        }

        public static CharSequence f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        public static android.app.RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        public static String h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    @e.T(23)
    public static class c {
        public static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    @e.T(24)
    public static class d {
        public static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    @e.T(26)
    public static class e {
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    @e.T(28)
    public static class f {
        public static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    @e.T(29)
    public static class g {
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        public static int c(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    @e.T(31)
    public static class h {
        public static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    public static class j extends u {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f110827j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IconCompat f110828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f110829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f110830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f110831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f110832i;

        @e.T(23)
        public static class a {
            private a() {
            }

            @e.T(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @e.T(31)
        public static class b {
            private b() {
            }

            @e.T(31)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @e.T(31)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @e.T(31)
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public j() {
        }

        @Nullable
        public static IconCompat A(@Nullable Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.l((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.r((Bitmap) parcelable);
            }
            return null;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat F(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            return parcelable != null ? A(parcelable) : A(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @NonNull
        public j B(@Nullable Bitmap bitmap) {
            this.f110829f = bitmap == null ? null : IconCompat.r(bitmap);
            this.f110830g = true;
            return this;
        }

        @NonNull
        @e.T(23)
        public j C(@Nullable Icon icon) {
            this.f110829f = icon == null ? null : IconCompat.l(icon);
            this.f110830g = true;
            return this;
        }

        @NonNull
        public j D(@Nullable Bitmap bitmap) {
            this.f110828e = bitmap == null ? null : IconCompat.r(bitmap);
            return this;
        }

        @NonNull
        @e.T(31)
        public j E(@Nullable Icon icon) {
            this.f110828e = IconCompat.l(icon);
            return this;
        }

        @NonNull
        public j G(@Nullable CharSequence charSequence) {
            this.f110877b = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        @e.T(31)
        public j H(@Nullable CharSequence charSequence) {
            this.f110831h = charSequence;
            return this;
        }

        @NonNull
        public j I(@Nullable CharSequence charSequence) {
            this.f110878c = Builder.limitCharSequenceLength(charSequence);
            this.f110879d = true;
            return this;
        }

        @NonNull
        @e.T(31)
        public j J(boolean z10) {
            this.f110832i = z10;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(a10.a()).setBigContentTitle(this.f110877b);
            IconCompat iconCompat = this.f110828e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f110828e.K(a10 instanceof H ? ((H) a10).f() : null));
                } else if (iconCompat.B() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f110828e.x());
                }
            }
            if (this.f110830g) {
                if (this.f110829f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f110829f.K(a10 instanceof H ? ((H) a10).f() : null));
                }
            }
            if (this.f110879d) {
                bigContentTitle.setSummaryText(this.f110878c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f110832i);
                b.b(bigContentTitle, this.f110831h);
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110827j;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.f110829f = A(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.f110830g = true;
            }
            this.f110828e = F(bundle);
            this.f110832i = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public j(@Nullable Builder builder) {
            z(builder);
        }
    }

    public static class k extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f110833f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f110834e;

        public k() {
        }

        @NonNull
        public k A(@Nullable CharSequence charSequence) {
            this.f110834e = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public k B(@Nullable CharSequence charSequence) {
            this.f110877b = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public k C(@Nullable CharSequence charSequence) {
            this.f110878c = Builder.limitCharSequenceLength(charSequence);
            this.f110879d = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(a10.a()).setBigContentTitle(this.f110877b).bigText(this.f110834e);
            if (this.f110879d) {
                bigTextStyleBigText.setSummaryText(this.f110878c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110833f;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f110834e = bundle.getCharSequence("android.bigText");
        }

        public k(@Nullable Builder builder) {
            z(builder);
        }
    }

    public static class l extends u {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f110835o = "androidx.core.app.NotificationCompat$CallStyle";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f110836p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f110837q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f110838r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f110839s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f110840t = "key_action_priority";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f110841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Person f110842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f110843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f110844h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f110845i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f110846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f110847k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f110848l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public IconCompat f110849m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f110850n;

        @e.T(20)
        public static class a {
            private a() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static Notification.Action.Builder b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Notification.Action.Builder d(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        @e.T(21)
        public static class b {
            private b() {
            }

            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @e.T(23)
        public static class c {
            private c() {
            }

            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @e.T(24)
        public static class d {
            private d() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        @e.T(28)
        public static class e {
            private e() {
            }

            public static Notification.Builder a(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(android.app.Person person) {
                return person;
            }
        }

        @e.T(31)
        public static class f {
            private f() {
            }

            public static Notification.CallStyle a(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, @InterfaceC4337k int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, @InterfaceC4337k int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle i(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface g {
        }

        public l() {
        }

        @NonNull
        public static l A(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new l(1, person, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static l B(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new l(2, person, pendingIntent, null, null);
        }

        @NonNull
        public static l C(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new l(3, person, pendingIntent, null, pendingIntent2);
        }

        @NonNull
        @e.T(20)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> D() {
            Action actionI = I();
            Action actionH = H();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(actionI);
            ArrayList<Action> arrayList2 = this.f110876a.mActions;
            int i10 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Action action = arrayList2.get(i11);
                    i11++;
                    Action action2 = action;
                    if (action2.l()) {
                        arrayList.add(action2);
                    } else if (!F(action2) && i10 > 1) {
                        arrayList.add(action2);
                        i10--;
                    }
                    if (actionH != null && i10 == 1) {
                        arrayList.add(actionH);
                        i10--;
                    }
                }
            }
            if (actionH != null && i10 >= 1) {
                arrayList.add(actionH);
            }
            return arrayList;
        }

        @Nullable
        public final String E() {
            int i10 = this.f110841e;
            if (i10 == 1) {
                return this.f110876a.mContext.getResources().getString(C5809a.h.f240811e);
            }
            if (i10 == 2) {
                return this.f110876a.mContext.getResources().getString(C5809a.h.f240812f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f110876a.mContext.getResources().getString(C5809a.h.f240813g);
        }

        public final boolean F(Action action) {
            return action != null && action.d().getBoolean(f110840t);
        }

        @NonNull
        @e.T(20)
        public final Action G(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C0920d.getColor(this.f110876a.mContext, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f110876a.mContext.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action actionBuild = new Action.Builder(IconCompat.v(this.f110876a.mContext, i10), spannableStringBuilder, pendingIntent).build();
            actionBuild.d().putBoolean(f110840t, true);
            return actionBuild;
        }

        @Nullable
        @e.T(20)
        public final Action H() {
            int i10 = C5809a.d.f240706c;
            int i11 = C5809a.d.f240704a;
            PendingIntent pendingIntent = this.f110843g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f110846j;
            return G(z10 ? i10 : i11, z10 ? C5809a.h.f240808b : C5809a.h.f240807a, this.f110847k, C5809a.b.f240678c, pendingIntent);
        }

        @NonNull
        @e.T(20)
        public final Action I() {
            int i10 = C5809a.d.f240708e;
            PendingIntent pendingIntent = this.f110844h;
            return pendingIntent == null ? G(i10, C5809a.h.f240810d, this.f110848l, C5809a.b.f240679d, this.f110845i) : G(i10, C5809a.h.f240809c, this.f110848l, C5809a.b.f240679d, pendingIntent);
        }

        @NonNull
        public l J(@InterfaceC4337k int i10) {
            this.f110847k = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public l K(@InterfaceC4337k int i10) {
            this.f110848l = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public l L(boolean z10) {
            this.f110846j = z10;
            return this;
        }

        @NonNull
        public l M(@Nullable Bitmap bitmap) {
            this.f110849m = IconCompat.r(bitmap);
            return this;
        }

        @NonNull
        @e.T(23)
        public l N(@Nullable Icon icon) {
            this.f110849m = icon == null ? null : IconCompat.l(icon);
            return this;
        }

        @NonNull
        public l O(@Nullable CharSequence charSequence) {
            this.f110850n = charSequence;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.f110841e);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.f110846j);
            Person person = this.f110842f;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, e.b(person.k()));
                } else {
                    bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, person.m());
                }
            }
            IconCompat iconCompat = this.f110849m;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, c.a(iconCompat.K(this.f110876a.mContext)));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.f110850n);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.f110843g);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.f110844h);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.f110845i);
            Integer num = this.f110847k;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.f110848l;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceE = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceE = null;
            if (i10 < 31) {
                Notification.Builder builderA = a10.a();
                Person person = this.f110842f;
                builderA.setContentTitle(person != null ? person.f() : null);
                Bundle bundle = this.f110876a.mExtras;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceE = this.f110876a.mExtras.getCharSequence("android.text");
                }
                if (charSequenceE == null) {
                    charSequenceE = E();
                }
                builderA.setContentText(charSequenceE);
                Person person2 = this.f110842f;
                if (person2 != null) {
                    if (person2.d() != null) {
                        c.c(builderA, this.f110842f.d().K(this.f110876a.mContext));
                    }
                    if (i10 >= 28) {
                        e.a(builderA, this.f110842f.k());
                    } else {
                        b.a(builderA, this.f110842f.g());
                    }
                }
                b.b(builderA, NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i11 = this.f110841e;
            if (i11 == 1) {
                callStyleA = f.a(this.f110842f.k(), this.f110844h, this.f110843g);
            } else if (i11 == 2) {
                callStyleA = f.b(this.f110842f.k(), this.f110845i);
            } else if (i11 == 3) {
                callStyleA = f.c(this.f110842f.k(), this.f110845i, this.f110843g);
            } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: " + String.valueOf(this.f110841e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(a10.a());
                Integer num = this.f110847k;
                if (num != null) {
                    f.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f110848l;
                if (num2 != null) {
                    f.f(callStyleA, num2.intValue());
                }
                f.i(callStyleA, this.f110850n);
                IconCompat iconCompat = this.f110849m;
                if (iconCompat != null) {
                    f.h(callStyleA, iconCompat.K(this.f110876a.mContext));
                }
                f.g(callStyleA, this.f110846j);
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110835o;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f110841e = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.f110846j = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.f110842f = Person.b.a(C.a(bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.f110842f = Person.b(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.f110849m = IconCompat.l((Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.f110849m = IconCompat.j(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.f110850n = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.f110843g = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.f110844h = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.f110845i = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.f110847k = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.f110848l = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        public l(@Nullable Builder builder) {
            z(builder);
        }

        public l(int i10, @NonNull Person person, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3) {
            if (person != null && !TextUtils.isEmpty(person.f())) {
                this.f110841e = i10;
                this.f110842f = person;
                this.f110843g = pendingIntent3;
                this.f110844h = pendingIntent2;
                this.f110845i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    public static class m extends u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f110851e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f110852f = 3;

        @e.T(24)
        public static class a {
            private a() {
            }

            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public static List<Action> C(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.l()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        @NonNull
        @e.T(24)
        public static List<CharSequence> D(@NonNull Context context, @NonNull Notification notification) {
            if (!E.a().getName().equals(notification.extras.getString(NotificationCompat.EXTRA_TEMPLATE))) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews2 = notification.bigContentView;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else if (remoteViews == null) {
                remoteViews = notification.headsUpContentView;
            }
            String str = remoteViews.getPackage();
            try {
                Context contextCreatePackageContext = context.createPackageContext(str, 0);
                contextCreatePackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View viewApply = remoteViews.apply(contextCreatePackageContext, null);
                ArrayList arrayList = new ArrayList();
                E(viewApply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public static void E(View view, ArrayList<CharSequence> arrayList) {
            CharSequence text;
            if (!(view instanceof ViewGroup)) {
                return;
            }
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    return;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                    arrayList.add(text);
                }
                if (childAt instanceof ViewGroup) {
                    E(childAt, arrayList);
                }
                i10++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.widget.RemoteViews A(android.widget.RemoteViews r7, boolean r8) {
            /*
                r6 = this;
                int r0 = y0.C5809a.g.f240803f
                r1 = 1
                r2 = 0
                android.widget.RemoteViews r0 = r6.c(r1, r0, r2)
                int r1 = y0.C5809a.e.f240734L
                r0.removeAllViews(r1)
                androidx.core.app.NotificationCompat$Builder r1 = r6.f110876a
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r1 = r1.mActions
                java.util.List r1 = C(r1)
                if (r8 == 0) goto L3b
                if (r1 == 0) goto L3b
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                int r8 = r1.size()
                r3 = 3
                int r8 = java.lang.Math.min(r8, r3)
                if (r8 <= 0) goto L3b
                r3 = r2
            L27:
                if (r3 >= r8) goto L3d
                java.lang.Object r4 = r1.get(r3)
                androidx.core.app.NotificationCompat$Action r4 = (androidx.core.app.NotificationCompat.Action) r4
                android.widget.RemoteViews r4 = r6.B(r4)
                int r5 = y0.C5809a.e.f240734L
                r0.addView(r5, r4)
                int r3 = r3 + 1
                goto L27
            L3b:
                r2 = 8
            L3d:
                int r8 = y0.C5809a.e.f240734L
                r0.setViewVisibility(r8, r2)
                int r8 = y0.C5809a.e.f240731I
                r0.setViewVisibility(r8, r2)
                r6.e(r0, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.m.A(android.widget.RemoteViews, boolean):android.widget.RemoteViews");
        }

        public final RemoteViews B(Action action) {
            boolean z10 = action.f110781k == null;
            RemoteViews remoteViews = new RemoteViews(this.f110876a.mContext.getPackageName(), z10 ? C5809a.g.f240802e : C5809a.g.f240801d);
            IconCompat iconCompatF = action.f();
            if (iconCompatF != null) {
                remoteViews.setImageViewBitmap(C5809a.e.f240732J, o(iconCompatF, C5809a.b.f240680e));
            }
            remoteViews.setTextViewText(C5809a.e.f240733K, action.f110780j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(C5809a.e.f240730H, action.f110781k);
            }
            remoteViews.setContentDescription(C5809a.e.f240730H, action.f110780j);
            return remoteViews;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                a10.a().setStyle(a.a());
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110851e;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews bigContentView = this.f110876a.getBigContentView();
            if (bigContentView == null) {
                bigContentView = this.f110876a.getContentView();
            }
            if (bigContentView == null) {
                return null;
            }
            return A(bigContentView, true);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(A a10) {
            if (Build.VERSION.SDK_INT < 24 && this.f110876a.getContentView() != null) {
                return A(this.f110876a.getContentView(), false);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(A a10) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews headsUpContentView = this.f110876a.getHeadsUpContentView();
            RemoteViews contentView = headsUpContentView != null ? headsUpContentView : this.f110876a.getContentView();
            if (headsUpContentView == null) {
                return null;
            }
            return A(contentView, true);
        }
    }

    public interface n {
        @NonNull
        Builder a(@NonNull Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface o {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface r {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface t {
    }

    public static abstract class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder f110876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f110877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f110878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f110879d = false;

        @e.T(24)
        public static class a {
            private a() {
            }

            public static void a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        public static float h(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        @Nullable
        public static u i(@Nullable String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new m();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new j();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new p();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new q();
                default:
                    return null;
            }
        }

        @Nullable
        public static u j(@Nullable String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new j();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new p();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (str.equals(G.a().getName())) {
                    return new q();
                }
                if (str.equals(E.a().getName())) {
                    return new m();
                }
            }
            return null;
        }

        @Nullable
        public static u k(@NonNull Bundle bundle) {
            u uVarI = i(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            return uVarI != null ? uVarI : (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) ? new q() : (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) ? new j() : bundle.containsKey("android.bigText") ? new k() : bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES) ? new p() : bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE) ? new l() : j(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        @Nullable
        public static u l(@NonNull Bundle bundle) {
            u uVarK = k(bundle);
            if (uVarK == null) {
                return null;
            }
            try {
                uVarK.y(bundle);
                return uVarK;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static u s(@NonNull Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return l(extras);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            if (this.f110879d) {
                bundle.putCharSequence("android.summaryText", this.f110878c);
            }
            CharSequence charSequence = this.f110877b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strT = t();
            if (strT != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strT);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                Method dump skipped, instruction units count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.u.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @Nullable
        public Notification d() {
            Builder builder = this.f110876a;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i10 = C5809a.e.f240752b0;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            remoteViews.setViewPadding(C5809a.e.f240754c0, 0, f(), 0, 0);
        }

        public final int f() {
            Resources resources = this.f110876a.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C5809a.c.f240702u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C5809a.c.f240703v);
            float fH = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((fH * dimensionPixelSize2) + ((1.0f - fH) * dimensionPixelSize));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void g(@NonNull Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i10, int i11) {
            return n(i10, i11, 0);
        }

        public final Bitmap n(int i10, int i11, int i12) {
            return p(IconCompat.v(this.f110876a.mContext, i10), i11, i12);
        }

        public Bitmap o(@NonNull IconCompat iconCompat, int i10) {
            return p(iconCompat, i10, 0);
        }

        public final Bitmap p(@NonNull IconCompat iconCompat, int i10, int i11) {
            Drawable drawableE = iconCompat.E(this.f110876a.mContext);
            int intrinsicWidth = i11 == 0 ? drawableE.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = drawableE.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            drawableE.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                drawableE.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            drawableE.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        public final Bitmap q(int i10, int i11, int i12, int i13) {
            int i14 = C5809a.d.f240717n;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap bitmapN = n(i14, i13, i11);
            Canvas canvas = new Canvas(bitmapN);
            Drawable drawableMutate = this.f110876a.mContext.getResources().getDrawable(i10).mutate();
            drawableMutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            drawableMutate.setBounds(i15, i15, i16, i16);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapN;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return this instanceof l;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return null;
        }

        public final void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C5809a.e.f240792v0, 8);
            remoteViews.setViewVisibility(C5809a.e.f240788t0, 8);
            remoteViews.setViewVisibility(C5809a.e.f240786s0, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(A a10) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(A a10) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(A a10) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f110878c = bundle.getCharSequence("android.summaryText");
                this.f110879d = true;
            }
            this.f110877b = bundle.getCharSequence("android.title.big");
        }

        public void z(@Nullable Builder builder) {
            if (this.f110876a != builder) {
                this.f110876a = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    @NonNull
    @e.T(20)
    public static Action getActionCompatFromAction(@NonNull Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int i10;
        android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i11 = 0; i11 < remoteInputs.length; i11++) {
                android.app.RemoteInput remoteInput = remoteInputs[i11];
                remoteInputArr2[i11] = new RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? g.c(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = i12 >= 24 ? action.getExtras().getBoolean(J.f110653c) || d.a(action) : action.getExtras().getBoolean(J.f110653c);
        boolean z11 = action.getExtras().getBoolean(Action.f110769x, true);
        int iA = i12 >= 28 ? f.a(action) : action.getExtras().getInt(Action.f110770y, 0);
        boolean zE = i12 >= 29 ? g.e(action) : false;
        boolean zA = i12 >= 31 ? h.a(action) : false;
        if (action.getIcon() != null || (i10 = action.icon) == 0) {
            return new Action(action.getIcon() != null ? IconCompat.m(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z10, iA, z11, zE, zA);
        }
        return new Action(i10, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z10, iA, z11, zE, zA);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return g.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.a(notification);
        }
        return 0;
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.a(g.b(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.b(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    @Nullable
    @e.S(expression = "notification.extras")
    @Deprecated
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.c(notification);
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @e.T(21)
    public static List<Action> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(CarExtender.f110805d);
        if (bundle2 != null && (bundle = bundle2.getBundle(CarExtender.f110809h)) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(J.g(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @Nullable
    public static B0.A getLocusId(@NonNull Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = g.d(notification)) == null) {
            return null;
        }
        return B0.A.d(locusIdD);
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<Person> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    arrayList.add(Person.b.a(C.a(obj)));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                int length = stringArray.length;
                while (i10 < length) {
                    arrayList.add(new Person.Builder().setUri(stringArray[i10]).build());
                    i10++;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return notification.getSortKey();
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return e.f(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5809a.c.f240688g);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C5809a.c.f240687f);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static final class CarExtender implements n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String f110805d = "android.car.EXTENSIONS";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f110806e = "large_icon";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f110807f = "car_conversation";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f110808g = "app_color";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String f110809h = "invisible_actions";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f110810i = "author";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f110811j = "text";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f110812k = "messages";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f110813l = "remote_input";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f110814m = "on_reply";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f110815n = "on_read";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f110816o = "participants";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f110817p = "timestamp";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f110818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UnreadConversation f110819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f110820c;

        @Deprecated
        public static class UnreadConversation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String[] f110821a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RemoteInput f110822b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f110823c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final PendingIntent f110824d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String[] f110825e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f110826f;

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(@NonNull String str) {
                    this.mParticipant = str;
                }

                @NonNull
                public Builder addMessage(@Nullable String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    List<String> list = this.mMessages;
                    return new UnreadConversation((String[]) list.toArray(new String[list.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                @NonNull
                public Builder setLatestTimestamp(long j10) {
                    this.mLatestTimestamp = j10;
                    return this;
                }

                @NonNull
                public Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                @NonNull
                public Builder setReplyAction(@Nullable PendingIntent pendingIntent, @Nullable RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            public UnreadConversation(@Nullable String[] strArr, @Nullable RemoteInput remoteInput, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable String[] strArr2, long j10) {
                this.f110821a = strArr;
                this.f110822b = remoteInput;
                this.f110824d = pendingIntent2;
                this.f110823c = pendingIntent;
                this.f110825e = strArr2;
                this.f110826f = j10;
            }

            public long a() {
                return this.f110826f;
            }

            @Nullable
            public String[] b() {
                return this.f110821a;
            }

            @Nullable
            public String c() {
                String[] strArr = this.f110825e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @Nullable
            public String[] d() {
                return this.f110825e;
            }

            @Nullable
            public PendingIntent e() {
                return this.f110824d;
            }

            @Nullable
            public RemoteInput f() {
                return this.f110822b;
            }

            @Nullable
            public PendingIntent g() {
                return this.f110823c;
            }
        }

        @e.T(20)
        public static class a {
            private a() {
            }

            public static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static android.app.RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            public static Parcelable c(android.app.RemoteInput remoteInput) {
                return remoteInput;
            }

            public static RemoteInput.Builder d(String str) {
                return new RemoteInput.Builder(str);
            }

            public static boolean e(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            public static CharSequence[] f(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            public static Bundle g(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            public static CharSequence h(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            public static String i(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            public static RemoteInput.Builder j(RemoteInput.Builder builder, boolean z10) {
                return builder.setAllowFreeFormInput(z10);
            }

            public static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            public static RemoteInput.Builder l(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        @e.T(29)
        public static class b {
            private b() {
            }

            public static int a(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        public CarExtender() {
            this.f110820c = 0;
        }

        @e.T(21)
        public static Bundle b(@NonNull UnreadConversation unreadConversation) {
            Bundle bundle = new Bundle();
            String str = (unreadConversation.d() == null || unreadConversation.d().length <= 1) ? null : unreadConversation.d()[0];
            int length = unreadConversation.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i10 = 0; i10 < length; i10++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.b()[i10]);
                bundle2.putString("author", str);
                parcelableArr[i10] = bundle2;
            }
            bundle.putParcelableArray(f110812k, parcelableArr);
            RemoteInput remoteInputF = unreadConversation.f();
            if (remoteInputF != null) {
                RemoteInput.Builder builderD = a.d(remoteInputF.f110968a);
                a.l(builderD, remoteInputF.f110969b);
                a.k(builderD, remoteInputF.f110970c);
                a.j(builderD, remoteInputF.f110971d);
                a.a(builderD, remoteInputF.f110973f);
                bundle.putParcelable(f110813l, a.c(a.b(builderD)));
            }
            bundle.putParcelable(f110814m, unreadConversation.g());
            bundle.putParcelable(f110815n, unreadConversation.e());
            bundle.putStringArray(f110816o, unreadConversation.d());
            bundle.putLong("timestamp", unreadConversation.a());
            return bundle;
        }

        @e.T(21)
        public static UnreadConversation f(@Nullable Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f110812k);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    Parcelable parcelable = parcelableArray[i10];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i10] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f110815n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f110814m);
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) bundle.getParcelable(f110813l);
            String[] stringArray = bundle.getStringArray(f110816o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new UnreadConversation(strArr, remoteInput != null ? new RemoteInput(a.i(remoteInput), a.h(remoteInput), a.f(remoteInput), a.e(remoteInput), Build.VERSION.SDK_INT >= 29 ? b.a(remoteInput) : 0, a.g(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.NotificationCompat.n
        @NonNull
        public Builder a(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f110818a;
            if (bitmap != null) {
                bundle.putParcelable(f110806e, bitmap);
            }
            int i10 = this.f110820c;
            if (i10 != 0) {
                bundle.putInt(f110808g, i10);
            }
            UnreadConversation unreadConversation = this.f110819b;
            if (unreadConversation != null) {
                bundle.putBundle(f110807f, b(unreadConversation));
            }
            builder.getExtras().putBundle(f110805d, bundle);
            return builder;
        }

        @InterfaceC4337k
        public int c() {
            return this.f110820c;
        }

        @Nullable
        public Bitmap d() {
            return this.f110818a;
        }

        @Nullable
        @Deprecated
        public UnreadConversation e() {
            return this.f110819b;
        }

        @NonNull
        public CarExtender g(@InterfaceC4337k int i10) {
            this.f110820c = i10;
            return this;
        }

        @NonNull
        public CarExtender h(@Nullable Bitmap bitmap) {
            this.f110818a = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender i(@Nullable UnreadConversation unreadConversation) {
            this.f110819b = unreadConversation;
            return this;
        }

        public CarExtender(@NonNull Notification notification) {
            this.f110820c = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(f110805d);
            if (bundle != null) {
                this.f110818a = (Bitmap) bundle.getParcelable(f110806e);
                this.f110820c = bundle.getInt(f110808g, 0);
                this.f110819b = f(bundle.getBundle(f110807f));
            }
        }
    }

    public static class p extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f110853f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<CharSequence> f110854e = new ArrayList<>();

        public p() {
        }

        @NonNull
        public p A(@Nullable CharSequence charSequence) {
            if (charSequence != null) {
                this.f110854e.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @NonNull
        public p B(@Nullable CharSequence charSequence) {
            this.f110877b = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @NonNull
        public p C(@Nullable CharSequence charSequence) {
            this.f110878c = Builder.limitCharSequenceLength(charSequence);
            this.f110879d = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(a10.a()).setBigContentTitle(this.f110877b);
            if (this.f110879d) {
                bigContentTitle.setSummaryText(this.f110878c);
            }
            ArrayList<CharSequence> arrayList = this.f110854e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                CharSequence charSequence = arrayList.get(i10);
                i10++;
                bigContentTitle.addLine(charSequence);
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110853f;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f110854e.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.f110854e, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        public p(@Nullable Builder builder) {
            z(builder);
        }
    }

    public static final class v implements n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f110880f = "TvExtender";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String f110881g = "android.tv.EXTENSIONS";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String f110882h = "flags";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f110883i = "content_intent";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f110884j = "delete_intent";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f110885k = "channel_id";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f110886l = "suppressShowOverApps";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f110887m = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f110889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PendingIntent f110890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PendingIntent f110891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f110892e;

        public v() {
            this.f110888a = 1;
        }

        @Override // androidx.core.app.NotificationCompat.n
        @NonNull
        public Builder a(@NonNull Builder builder) {
            if (Build.VERSION.SDK_INT < 26) {
                return builder;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("flags", this.f110888a);
            bundle.putString(f110885k, this.f110889b);
            bundle.putBoolean(f110886l, this.f110892e);
            PendingIntent pendingIntent = this.f110890c;
            if (pendingIntent != null) {
                bundle.putParcelable(f110883i, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.f110891d;
            if (pendingIntent2 != null) {
                bundle.putParcelable(f110884j, pendingIntent2);
            }
            builder.getExtras().putBundle(f110881g, bundle);
            return builder;
        }

        @Nullable
        public String b() {
            return this.f110889b;
        }

        @Nullable
        public PendingIntent c() {
            return this.f110890c;
        }

        @Nullable
        public PendingIntent d() {
            return this.f110891d;
        }

        public boolean e() {
            return (this.f110888a & 1) != 0;
        }

        public boolean f() {
            return this.f110892e;
        }

        @NonNull
        public v g(@Nullable String str) {
            this.f110889b = str;
            return this;
        }

        @NonNull
        public v h(@Nullable PendingIntent pendingIntent) {
            this.f110890c = pendingIntent;
            return this;
        }

        @NonNull
        public v i(@Nullable PendingIntent pendingIntent) {
            this.f110891d = pendingIntent;
            return this;
        }

        @NonNull
        public v j(boolean z10) {
            this.f110892e = z10;
            return this;
        }

        public v(@NonNull Notification notification) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(f110881g);
            if (bundle2 != null) {
                this.f110888a = bundle2.getInt("flags");
                this.f110889b = bundle2.getString(f110885k);
                this.f110892e = bundle2.getBoolean(f110886l);
                this.f110890c = (PendingIntent) bundle2.getParcelable(f110883i);
                this.f110891d = (PendingIntent) bundle2.getParcelable(f110884j);
            }
        }
    }

    public static class q extends u {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f110855j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f110856k = 25;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<d> f110857e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<d> f110858f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Person f110859g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public CharSequence f110860h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Boolean f110861i;

        @e.T(24)
        public static class a {
            private a() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @e.T(26)
        public static class b {
            private b() {
            }

            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @e.T(28)
        public static class c {
            private c() {
            }

            public static Notification.MessagingStyle a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public q() {
        }

        @Nullable
        public static q E(@NonNull Notification notification) {
            u uVarS = u.s(notification);
            if (uVarS instanceof q) {
                return (q) uVarS;
            }
            return null;
        }

        @NonNull
        public q A(@Nullable d dVar) {
            if (dVar != null) {
                this.f110858f.add(dVar);
                if (this.f110858f.size() > 25) {
                    this.f110858f.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public q B(@Nullable d dVar) {
            if (dVar != null) {
                this.f110857e.add(dVar);
                if (this.f110857e.size() > 25) {
                    this.f110857e.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public q C(@Nullable CharSequence charSequence, long j10, @Nullable Person person) {
            B(new d(charSequence, j10, person));
            return this;
        }

        @NonNull
        @Deprecated
        public q D(@Nullable CharSequence charSequence, long j10, @Nullable CharSequence charSequence2) {
            this.f110857e.add(new d(charSequence, j10, new Person.Builder().setName(charSequence2).build()));
            if (this.f110857e.size() > 25) {
                this.f110857e.remove(0);
            }
            return this;
        }

        @Nullable
        public final d F() {
            for (int size = this.f110857e.size() - 1; size >= 0; size--) {
                d dVar = this.f110857e.get(size);
                Person person = dVar.f110872c;
                if (person != null && !TextUtils.isEmpty(person.f())) {
                    return dVar;
                }
            }
            if (this.f110857e.isEmpty()) {
                return null;
            }
            return (d) androidx.appcompat.view.menu.d.a(this.f110857e, 1);
        }

        @Nullable
        public CharSequence G() {
            return this.f110860h;
        }

        @NonNull
        public List<d> H() {
            return this.f110858f;
        }

        @NonNull
        public List<d> I() {
            return this.f110857e;
        }

        @NonNull
        public Person J() {
            return this.f110859g;
        }

        @Nullable
        @Deprecated
        public CharSequence K() {
            return this.f110859g.f();
        }

        public final boolean L() {
            for (int size = this.f110857e.size() - 1; size >= 0; size--) {
                Person person = this.f110857e.get(size).f110872c;
                if (person != null && person.f() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean M() {
            Builder builder = this.f110876a;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.f110861i == null) {
                return this.f110860h != null;
            }
            Boolean bool = this.f110861i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @NonNull
        public final TextAppearanceSpan N(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        public final CharSequence O(@NonNull d dVar) {
            BidiFormatter bidiFormatterC = BidiFormatter.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Person person = dVar.f110872c;
            CharSequence charSequenceF = person == null ? "" : person.f();
            int color = -16777216;
            if (TextUtils.isEmpty(charSequenceF)) {
                charSequenceF = this.f110859g.f();
                if (this.f110876a.getColor() != 0) {
                    color = this.f110876a.getColor();
                }
            }
            CharSequence charSequenceM = bidiFormatterC.m(charSequenceF);
            spannableStringBuilder.append(charSequenceM);
            spannableStringBuilder.setSpan(N(color), spannableStringBuilder.length() - ((SpannableStringBuilder) charSequenceM).length(), spannableStringBuilder.length(), 33);
            CharSequence charSequence = dVar.f110870a;
            spannableStringBuilder.append((CharSequence) GlideException.a.f139488d).append(bidiFormatterC.m(charSequence != null ? charSequence : ""));
            return spannableStringBuilder;
        }

        @NonNull
        public q P(@Nullable CharSequence charSequence) {
            this.f110860h = charSequence;
            return this;
        }

        @NonNull
        public q Q(boolean z10) {
            this.f110861i = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.u
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.f110859g.f());
            bundle.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.f110859g.m());
            bundle.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.f110860h);
            if (this.f110860h != null && this.f110861i.booleanValue()) {
                bundle.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.f110860h);
            }
            if (!this.f110857e.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, d.a(this.f110857e));
            }
            if (!this.f110858f.isEmpty()) {
                bundle.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, d.a(this.f110858f));
            }
            Boolean bool = this.f110861i;
            if (bool != null) {
                bundle.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void b(A a10) {
            Q(M());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                Notification.MessagingStyle messagingStyleA = i10 >= 28 ? c.a(this.f110859g.k()) : a.b(this.f110859g.f());
                Iterator<d> it = this.f110857e.iterator();
                while (it.hasNext()) {
                    a.a(F.a(messagingStyleA), it.next().l());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator<d> it2 = this.f110858f.iterator();
                    while (it2.hasNext()) {
                        b.a(F.a(messagingStyleA), it2.next().l());
                    }
                }
                if (this.f110861i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    a.c(F.a(messagingStyleA), this.f110860h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    c.b(F.a(messagingStyleA), this.f110861i.booleanValue());
                }
                messagingStyleA.setBuilder(a10.a());
                return;
            }
            d dVarF = F();
            if (this.f110860h != null && this.f110861i.booleanValue()) {
                a10.a().setContentTitle(this.f110860h);
            } else if (dVarF != null) {
                a10.a().setContentTitle("");
                if (dVarF.f110872c != null) {
                    a10.a().setContentTitle(dVarF.f110872c.f());
                }
            }
            if (dVarF != null) {
                a10.a().setContentText(this.f110860h != null ? O(dVarF) : dVarF.f110870a);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = this.f110860h != null || L();
            for (int size = this.f110857e.size() - 1; size >= 0; size--) {
                d dVar = this.f110857e.get(size);
                CharSequence charSequenceO = z10 ? O(dVar) : dVar.f110870a;
                if (size != this.f110857e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, charSequenceO);
            }
            new Notification.BigTextStyle(a10.a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.u
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public String t() {
            return f110855j;
        }

        @Override // androidx.core.app.NotificationCompat.u
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f110857e.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.f110859g = Person.b(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.f110859g = new Person.Builder().setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.f110860h = charSequence;
            if (charSequence == null) {
                this.f110860h = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.f110857e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.f110858f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.f110861i = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @Deprecated
        public q(@NonNull CharSequence charSequence) {
            this.f110859g = new Person.Builder().setName(charSequence).build();
        }

        public static final class d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final String f110862g = "text";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final String f110863h = "time";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final String f110864i = "sender";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final String f110865j = "type";

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final String f110866k = "uri";

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final String f110867l = "extras";

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final String f110868m = "person";

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final String f110869n = "sender_person";

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CharSequence f110870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f110871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Person f110872c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Bundle f110873d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public String f110874e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public Uri f110875f;

            @e.T(24)
            public static class a {
                private a() {
                }

                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @e.T(28)
            public static class b {
                private b() {
                }

                public static Parcelable a(android.app.Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(@Nullable CharSequence charSequence, long j10, @Nullable Person person) {
                this.f110873d = new Bundle();
                this.f110870a = charSequence;
                this.f110871b = j10;
                this.f110872c = person;
            }

            @NonNull
            public static Bundle[] a(@NonNull List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m();
                }
                return bundleArr;
            }

            @Nullable
            public static d e(@NonNull Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f110868m) ? Person.b(bundle.getBundle(f110868m)) : (!bundle.containsKey(f110869n) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey(f110864i) ? new Person.Builder().setName(bundle.getCharSequence(f110864i)).build() : null : Person.b.a(C.a(bundle.getParcelable(f110869n))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            dVar.f110874e = string;
                            dVar.f110875f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.f110873d.putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @NonNull
            public static List<d> f(@NonNull Parcelable[] parcelableArr) {
                d dVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (dVarE = e((Bundle) parcelable)) != null) {
                        arrayList.add(dVarE);
                    }
                }
                return arrayList;
            }

            @Nullable
            public String b() {
                return this.f110874e;
            }

            @Nullable
            public Uri c() {
                return this.f110875f;
            }

            @NonNull
            public Bundle d() {
                return this.f110873d;
            }

            @Nullable
            public Person g() {
                return this.f110872c;
            }

            @Nullable
            @Deprecated
            public CharSequence h() {
                Person person = this.f110872c;
                if (person == null) {
                    return null;
                }
                return person.f();
            }

            @Nullable
            public CharSequence i() {
                return this.f110870a;
            }

            public long j() {
                return this.f110871b;
            }

            @NonNull
            public d k(@Nullable String str, @Nullable Uri uri) {
                this.f110874e = str;
                this.f110875f = uri;
                return this;
            }

            @NonNull
            @e.T(24)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            public Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message messageA;
                Person person = this.f110872c;
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.b(this.f110870a, this.f110871b, person != null ? person.k() : null);
                } else {
                    messageA = a.a(this.f110870a, this.f110871b, person != null ? person.f() : null);
                }
                String str = this.f110874e;
                if (str != null) {
                    a.b(messageA, str, this.f110875f);
                }
                return messageA;
            }

            @NonNull
            public final Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f110870a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f110871b);
                Person person = this.f110872c;
                if (person != null) {
                    bundle.putCharSequence(f110864i, person.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f110869n, b.a(this.f110872c.k()));
                    } else {
                        bundle.putBundle(f110868m, this.f110872c.m());
                    }
                }
                String str = this.f110874e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f110875f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f110873d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public d(@Nullable CharSequence charSequence, long j10, @Nullable CharSequence charSequence2) {
                this(charSequence, j10, new Person.Builder().setName(charSequence2).build());
            }
        }

        public q(@NonNull Person person) {
            if (!TextUtils.isEmpty(person.f())) {
                this.f110859g = person;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static final class w implements n {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final String f110893A = "displayIntent";

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final String f110894B = "pages";

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final String f110895C = "background";

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final String f110896D = "contentIcon";

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final String f110897E = "contentIconGravity";

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final String f110898F = "contentActionIndex";

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final String f110899G = "customSizePreset";

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final String f110900H = "customContentHeight";

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final String f110901I = "gravity";

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final String f110902J = "hintScreenTimeout";

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final String f110903K = "dismissalId";

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final String f110904L = "bridgeTag";

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final int f110905M = 1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final int f110906N = 2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final int f110907O = 4;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final int f110908P = 8;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final int f110909Q = 16;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final int f110910R = 32;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final int f110911S = 64;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final int f110912T = 1;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final int f110913U = 8388613;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final int f110914V = 80;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f110915o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f110916p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f110917q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f110918r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f110919s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f110920t = 4;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f110921u = 5;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f110922v = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f110923w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f110924x = "android.wearable.EXTENSIONS";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f110925y = "actions";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f110926z = "flags";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<Action> f110927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f110928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PendingIntent f110929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<Notification> f110930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f110931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f110932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f110933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f110934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f110935i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f110936j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f110937k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f110938l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f110939m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f110940n;

        @e.T(20)
        public static class a {
            private a() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            public static Notification.Action.Builder b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Notification.Action.Builder d(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }

            public static Action e(ArrayList<Parcelable> arrayList, int i10) {
                return NotificationCompat.getActionCompatFromAction((Notification.Action) arrayList.get(i10));
            }
        }

        @e.T(23)
        public static class b {
            private b() {
            }

            public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        @e.T(24)
        public static class c {
            private c() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        @e.T(31)
        public static class d {
            private d() {
            }

            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }
        }

        public w() {
            this.f110927a = new ArrayList<>();
            this.f110928b = 1;
            this.f110930d = new ArrayList<>();
            this.f110933g = 8388613;
            this.f110934h = -1;
            this.f110935i = 0;
            this.f110937k = 80;
        }

        @e.T(20)
        public static Notification.Action i(Action action) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatF = action.f();
            Notification.Action.Builder builderA = b.a(iconCompatF == null ? null : iconCompatF.J(), action.j(), action.a());
            Bundle bundle = action.d() != null ? new Bundle(action.d()) : new Bundle();
            bundle.putBoolean(J.f110653c, action.b());
            if (i10 >= 24) {
                c.a(builderA, action.b());
            }
            if (i10 >= 31) {
                d.a(builderA, action.k());
            }
            a.a(builderA, bundle);
            RemoteInput[] remoteInputArrG = action.g();
            if (remoteInputArrG != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.d(remoteInputArrG)) {
                    a.b(builderA, remoteInput);
                }
            }
            return a.c(builderA);
        }

        @Deprecated
        public boolean A() {
            return (this.f110928b & 4) != 0;
        }

        @NonNull
        @Deprecated
        public List<Notification> B() {
            return this.f110930d;
        }

        public boolean C() {
            return (this.f110928b & 8) != 0;
        }

        @NonNull
        @Deprecated
        public w D(@Nullable Bitmap bitmap) {
            this.f110931e = bitmap;
            return this;
        }

        @NonNull
        public w E(@Nullable String str) {
            this.f110940n = str;
            return this;
        }

        @NonNull
        public w F(int i10) {
            this.f110934h = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public w G(int i10) {
            this.f110932f = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public w H(int i10) {
            this.f110933g = i10;
            return this;
        }

        @NonNull
        public w I(boolean z10) {
            N(1, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public w J(int i10) {
            this.f110936j = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public w K(int i10) {
            this.f110935i = i10;
            return this;
        }

        @NonNull
        public w L(@Nullable String str) {
            this.f110939m = str;
            return this;
        }

        @NonNull
        @Deprecated
        public w M(@Nullable PendingIntent pendingIntent) {
            this.f110929c = pendingIntent;
            return this;
        }

        public final void N(int i10, boolean z10) {
            if (z10) {
                this.f110928b = i10 | this.f110928b;
            } else {
                this.f110928b = (~i10) & this.f110928b;
            }
        }

        @NonNull
        @Deprecated
        public w O(int i10) {
            this.f110937k = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public w P(boolean z10) {
            N(32, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public w Q(boolean z10) {
            N(16, z10);
            return this;
        }

        @NonNull
        public w R(boolean z10) {
            N(64, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public w S(boolean z10) {
            N(2, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public w T(int i10) {
            this.f110938l = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public w U(boolean z10) {
            N(4, z10);
            return this;
        }

        @NonNull
        public w V(boolean z10) {
            N(8, z10);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.n
        @NonNull
        public Builder a(@NonNull Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.f110927a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f110927a.size());
                ArrayList<Action> arrayList2 = this.f110927a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Action action = arrayList2.get(i10);
                    i10++;
                    arrayList.add(i(action));
                }
                bundle.putParcelableArrayList(f110925y, arrayList);
            }
            int i11 = this.f110928b;
            if (i11 != 1) {
                bundle.putInt("flags", i11);
            }
            PendingIntent pendingIntent = this.f110929c;
            if (pendingIntent != null) {
                bundle.putParcelable(f110893A, pendingIntent);
            }
            if (!this.f110930d.isEmpty()) {
                ArrayList<Notification> arrayList3 = this.f110930d;
                bundle.putParcelableArray(f110894B, (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
            }
            Bitmap bitmap = this.f110931e;
            if (bitmap != null) {
                bundle.putParcelable(f110895C, bitmap);
            }
            int i12 = this.f110932f;
            if (i12 != 0) {
                bundle.putInt(f110896D, i12);
            }
            int i13 = this.f110933g;
            if (i13 != 8388613) {
                bundle.putInt(f110897E, i13);
            }
            int i14 = this.f110934h;
            if (i14 != -1) {
                bundle.putInt(f110898F, i14);
            }
            int i15 = this.f110935i;
            if (i15 != 0) {
                bundle.putInt(f110899G, i15);
            }
            int i16 = this.f110936j;
            if (i16 != 0) {
                bundle.putInt(f110900H, i16);
            }
            int i17 = this.f110937k;
            if (i17 != 80) {
                bundle.putInt(f110901I, i17);
            }
            int i18 = this.f110938l;
            if (i18 != 0) {
                bundle.putInt(f110902J, i18);
            }
            String str = this.f110939m;
            if (str != null) {
                bundle.putString(f110903K, str);
            }
            String str2 = this.f110940n;
            if (str2 != null) {
                bundle.putString(f110904L, str2);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        @NonNull
        public w b(@NonNull Action action) {
            this.f110927a.add(action);
            return this;
        }

        @NonNull
        public w c(@NonNull List<Action> list) {
            this.f110927a.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public w d(@NonNull Notification notification) {
            this.f110930d.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public w e(@NonNull List<Notification> list) {
            this.f110930d.addAll(list);
            return this;
        }

        @NonNull
        public w f() {
            this.f110927a.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public w g() {
            this.f110930d.clear();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public w clone() {
            w wVar = new w();
            wVar.f110927a = new ArrayList<>(this.f110927a);
            wVar.f110928b = this.f110928b;
            wVar.f110929c = this.f110929c;
            wVar.f110930d = new ArrayList<>(this.f110930d);
            wVar.f110931e = this.f110931e;
            wVar.f110932f = this.f110932f;
            wVar.f110933g = this.f110933g;
            wVar.f110934h = this.f110934h;
            wVar.f110935i = this.f110935i;
            wVar.f110936j = this.f110936j;
            wVar.f110937k = this.f110937k;
            wVar.f110938l = this.f110938l;
            wVar.f110939m = this.f110939m;
            wVar.f110940n = this.f110940n;
            return wVar;
        }

        @NonNull
        public List<Action> j() {
            return this.f110927a;
        }

        @Nullable
        @Deprecated
        public Bitmap k() {
            return this.f110931e;
        }

        @Nullable
        public String l() {
            return this.f110940n;
        }

        public int m() {
            return this.f110934h;
        }

        @Deprecated
        public int n() {
            return this.f110932f;
        }

        @Deprecated
        public int o() {
            return this.f110933g;
        }

        public boolean p() {
            return (this.f110928b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f110936j;
        }

        @Deprecated
        public int r() {
            return this.f110935i;
        }

        @Nullable
        public String s() {
            return this.f110939m;
        }

        @Nullable
        @Deprecated
        public PendingIntent t() {
            return this.f110929c;
        }

        @Deprecated
        public int u() {
            return this.f110937k;
        }

        @Deprecated
        public boolean v() {
            return (this.f110928b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f110928b & 16) != 0;
        }

        public boolean x() {
            return (this.f110928b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f110928b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f110938l;
        }

        public w(@NonNull Notification notification) {
            this.f110927a = new ArrayList<>();
            this.f110928b = 1;
            this.f110930d = new ArrayList<>();
            this.f110933g = 8388613;
            this.f110934h = -1;
            this.f110935i = 0;
            this.f110937k = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f110925y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        actionArr[i10] = a.e(parcelableArrayList, i10);
                    }
                    Collections.addAll(this.f110927a, actionArr);
                }
                this.f110928b = bundle.getInt("flags", 1);
                this.f110929c = (PendingIntent) bundle.getParcelable(f110893A);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, f110894B);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.f110930d, notificationArrayFromBundle);
                }
                this.f110931e = (Bitmap) bundle.getParcelable(f110895C);
                this.f110932f = bundle.getInt(f110896D);
                this.f110933g = bundle.getInt(f110897E, 8388613);
                this.f110934h = bundle.getInt(f110898F, -1);
                this.f110935i = bundle.getInt(f110899G, 0);
                this.f110936j = bundle.getInt(f110900H);
                this.f110937k = bundle.getInt(f110901I, 80);
                this.f110938l = bundle.getInt(f110902J);
                this.f110939m = bundle.getString(f110903K);
                this.f110940n = bundle.getString(f110904L);
            }
        }
    }
}
