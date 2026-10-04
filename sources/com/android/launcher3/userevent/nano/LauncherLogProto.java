package com.android.launcher3.userevent.nano;

import com.android.launcher3.userevent.nano.LauncherLogExtensions;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public interface LauncherLogProto {

    public static final class Action extends MessageNano {
        private static volatile Action[] _emptyArray;
        public int command;
        public int dir;
        public boolean isOutside;
        public boolean isStateChange;
        public int touch;
        public int type;

        public interface Command {
            public static final int BACK = 1;
            public static final int CANCEL = 3;
            public static final int CONFIRM = 4;
            public static final int ENTRY = 2;
            public static final int HOME_INTENT = 0;
            public static final int RECENTS_BUTTON = 6;
            public static final int RESUME = 7;
            public static final int STOP = 5;
        }

        public interface Direction {
            public static final int DOWN = 2;
            public static final int LEFT = 3;
            public static final int NONE = 0;
            public static final int RIGHT = 4;
            public static final int UP = 1;
        }

        public interface Touch {
            public static final int DRAGDROP = 2;
            public static final int FLING = 4;
            public static final int LONGPRESS = 1;
            public static final int PINCH = 5;
            public static final int SWIPE = 3;
            public static final int TAP = 0;
        }

        public interface Type {
            public static final int AUTOMATED = 1;
            public static final int COMMAND = 2;
            public static final int TIP = 3;
            public static final int TOUCH = 0;
        }

        public Action() {
            clear();
        }

        public static Action[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Action[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Action parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Action) MessageNano.mergeFrom(new Action(), bArr);
        }

        public Action clear() {
            this.type = 0;
            this.touch = 0;
            this.dir = 0;
            this.command = 0;
            this.isOutside = false;
            this.isStateChange = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i10 = this.type;
            if (i10 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
            }
            int i11 = this.touch;
            if (i11 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i11);
            }
            int i12 = this.dir;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i12);
            }
            int i13 = this.command;
            if (i13 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
            }
            boolean z10 = this.isOutside;
            if (z10) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z10);
            }
            boolean z11 = this.isStateChange;
            return z11 ? CodedOutputByteBufferNano.computeBoolSize(6, z11) + iComputeSerializedSize : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i10 = this.type;
            if (i10 != 0) {
                codedOutputByteBufferNano.writeInt32(1, i10);
            }
            int i11 = this.touch;
            if (i11 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i11);
            }
            int i12 = this.dir;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(3, i12);
            }
            int i13 = this.command;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeInt32(4, i13);
            }
            boolean z10 = this.isOutside;
            if (z10) {
                codedOutputByteBufferNano.writeBool(5, z10);
            }
            boolean z11 = this.isStateChange;
            if (z11) {
                codedOutputByteBufferNano.writeBool(6, z11);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static Action parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Action().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public Action mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag != 0) {
                    if (tag == 8) {
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                            this.type = int32;
                        }
                    } else if (tag == 16) {
                        int int322 = codedInputByteBufferNano.readInt32();
                        if (int322 == 0 || int322 == 1 || int322 == 2 || int322 == 3 || int322 == 4 || int322 == 5) {
                            this.touch = int322;
                        }
                    } else if (tag == 24) {
                        int int323 = codedInputByteBufferNano.readInt32();
                        if (int323 == 0 || int323 == 1 || int323 == 2 || int323 == 3 || int323 == 4) {
                            this.dir = int323;
                        }
                    } else if (tag == 32) {
                        int int324 = codedInputByteBufferNano.readInt32();
                        switch (int324) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                this.command = int324;
                                break;
                        }
                    } else if (tag == 40) {
                        this.isOutside = codedInputByteBufferNano.readBool();
                    } else if (tag == 48) {
                        this.isStateChange = codedInputByteBufferNano.readBool();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                }
            }
            return this;
        }
    }

    public interface ContainerType {
        public static final int ALLAPPS = 4;
        public static final int APP = 13;
        public static final int DEEPSHORTCUTS = 9;
        public static final int DEFAULT_CONTAINERTYPE = 0;
        public static final int FOLDER = 3;
        public static final int HOTSEAT = 2;
        public static final int NAVBAR = 11;
        public static final int OVERVIEW = 6;
        public static final int PINITEM = 10;
        public static final int PREDICTION = 7;
        public static final int SEARCHRESULT = 8;
        public static final int SIDELOADED_LAUNCHER = 15;
        public static final int TASKSWITCHER = 12;
        public static final int TIP = 14;
        public static final int WIDGETS = 5;
        public static final int WORKSPACE = 1;
    }

    public interface ControlType {
        public static final int ALL_APPS_BUTTON = 1;
        public static final int APPINFO_TARGET = 7;
        public static final int BACK_BUTTON = 11;
        public static final int CANCEL_TARGET = 14;
        public static final int CLEAR_ALL_BUTTON = 13;
        public static final int DEFAULT_CONTROLTYPE = 0;
        public static final int HOME_INTENT = 10;
        public static final int QUICK_SCRUB_BUTTON = 12;
        public static final int REMOVE_TARGET = 5;
        public static final int RESIZE_HANDLE = 8;
        public static final int SETTINGS_BUTTON = 4;
        public static final int SPLIT_SCREEN_TARGET = 16;
        public static final int TASK_PREVIEW = 15;
        public static final int UNINSTALL_TARGET = 6;
        public static final int VERTICAL_SCROLL = 9;
        public static final int WALLPAPER_BUTTON = 3;
        public static final int WIDGETS_BUTTON = 2;
    }

    public interface ItemType {
        public static final int APP_ICON = 1;
        public static final int DEEPSHORTCUT = 5;
        public static final int DEFAULT_ITEMTYPE = 0;
        public static final int EDITTEXT = 7;
        public static final int FOLDER_ICON = 4;
        public static final int NOTIFICATION = 8;
        public static final int SEARCHBOX = 6;
        public static final int SHORTCUT = 2;
        public static final int TASK = 9;
        public static final int WEB_APP = 10;
        public static final int WIDGET = 3;
    }

    public static final class LauncherEvent extends MessageNano {
        private static volatile LauncherEvent[] _emptyArray;
        public Action action;
        public long actionDurationMillis;
        public Target[] destTarget;
        public long elapsedContainerMillis;
        public long elapsedSessionMillis;
        public LauncherLogExtensions.LauncherEventExtension extension;
        public boolean isInLandscapeMode;
        public boolean isInMultiWindowMode;
        public Target[] srcTarget;

        public LauncherEvent() {
            clear();
        }

        public static LauncherEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LauncherEvent[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LauncherEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LauncherEvent) MessageNano.mergeFrom(new LauncherEvent(), bArr);
        }

        public LauncherEvent clear() {
            this.action = null;
            this.srcTarget = Target.emptyArray();
            this.destTarget = Target.emptyArray();
            this.actionDurationMillis = 0L;
            this.elapsedContainerMillis = 0L;
            this.elapsedSessionMillis = 0L;
            this.isInMultiWindowMode = false;
            this.isInLandscapeMode = false;
            this.extension = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            Action action = this.action;
            if (action != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, action);
            }
            Target[] targetArr = this.srcTarget;
            int i10 = 0;
            if (targetArr != null && targetArr.length > 0) {
                int i11 = 0;
                while (true) {
                    Target[] targetArr2 = this.srcTarget;
                    if (i11 >= targetArr2.length) {
                        break;
                    }
                    Target target = targetArr2[i11];
                    if (target != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, target) + iComputeSerializedSize;
                    }
                    i11++;
                }
            }
            Target[] targetArr3 = this.destTarget;
            if (targetArr3 != null && targetArr3.length > 0) {
                while (true) {
                    Target[] targetArr4 = this.destTarget;
                    if (i10 >= targetArr4.length) {
                        break;
                    }
                    Target target2 = targetArr4[i10];
                    if (target2 != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, target2) + iComputeSerializedSize;
                    }
                    i10++;
                }
            }
            long j10 = this.actionDurationMillis;
            if (j10 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
            }
            long j11 = this.elapsedContainerMillis;
            if (j11 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(5, j11);
            }
            long j12 = this.elapsedSessionMillis;
            if (j12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(6, j12);
            }
            boolean z10 = this.isInMultiWindowMode;
            if (z10) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z10);
            }
            boolean z11 = this.isInLandscapeMode;
            if (z11) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z11);
            }
            LauncherLogExtensions.LauncherEventExtension launcherEventExtension = this.extension;
            return launcherEventExtension != null ? CodedOutputByteBufferNano.computeMessageSize(9, launcherEventExtension) + iComputeSerializedSize : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Action action = this.action;
            if (action != null) {
                codedOutputByteBufferNano.writeMessage(1, action);
            }
            Target[] targetArr = this.srcTarget;
            int i10 = 0;
            if (targetArr != null && targetArr.length > 0) {
                int i11 = 0;
                while (true) {
                    Target[] targetArr2 = this.srcTarget;
                    if (i11 >= targetArr2.length) {
                        break;
                    }
                    Target target = targetArr2[i11];
                    if (target != null) {
                        codedOutputByteBufferNano.writeMessage(2, target);
                    }
                    i11++;
                }
            }
            Target[] targetArr3 = this.destTarget;
            if (targetArr3 != null && targetArr3.length > 0) {
                while (true) {
                    Target[] targetArr4 = this.destTarget;
                    if (i10 >= targetArr4.length) {
                        break;
                    }
                    Target target2 = targetArr4[i10];
                    if (target2 != null) {
                        codedOutputByteBufferNano.writeMessage(3, target2);
                    }
                    i10++;
                }
            }
            long j10 = this.actionDurationMillis;
            if (j10 != 0) {
                codedOutputByteBufferNano.writeInt64(4, j10);
            }
            long j11 = this.elapsedContainerMillis;
            if (j11 != 0) {
                codedOutputByteBufferNano.writeInt64(5, j11);
            }
            long j12 = this.elapsedSessionMillis;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeInt64(6, j12);
            }
            boolean z10 = this.isInMultiWindowMode;
            if (z10) {
                codedOutputByteBufferNano.writeBool(7, z10);
            }
            boolean z11 = this.isInLandscapeMode;
            if (z11) {
                codedOutputByteBufferNano.writeBool(8, z11);
            }
            LauncherLogExtensions.LauncherEventExtension launcherEventExtension = this.extension;
            if (launcherEventExtension != null) {
                codedOutputByteBufferNano.writeMessage(9, launcherEventExtension);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static LauncherEvent parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LauncherEvent().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public LauncherEvent mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.action == null) {
                        this.action = new Action();
                    }
                    codedInputByteBufferNano.readMessage(this.action);
                } else if (tag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    Target[] targetArr = this.srcTarget;
                    int length = targetArr == null ? 0 : targetArr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    Target[] targetArr2 = new Target[i10];
                    if (length != 0) {
                        System.arraycopy(targetArr, 0, targetArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        Target target = new Target();
                        targetArr2[length] = target;
                        codedInputByteBufferNano.readMessage(target);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    Target target2 = new Target();
                    targetArr2[length] = target2;
                    codedInputByteBufferNano.readMessage(target2);
                    this.srcTarget = targetArr2;
                } else if (tag == 26) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    Target[] targetArr3 = this.destTarget;
                    int length2 = targetArr3 == null ? 0 : targetArr3.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    Target[] targetArr4 = new Target[i11];
                    if (length2 != 0) {
                        System.arraycopy(targetArr3, 0, targetArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        Target target3 = new Target();
                        targetArr4[length2] = target3;
                        codedInputByteBufferNano.readMessage(target3);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    Target target4 = new Target();
                    targetArr4[length2] = target4;
                    codedInputByteBufferNano.readMessage(target4);
                    this.destTarget = targetArr4;
                } else if (tag == 32) {
                    this.actionDurationMillis = codedInputByteBufferNano.readInt64();
                } else if (tag == 40) {
                    this.elapsedContainerMillis = codedInputByteBufferNano.readInt64();
                } else if (tag == 48) {
                    this.elapsedSessionMillis = codedInputByteBufferNano.readInt64();
                } else if (tag == 56) {
                    this.isInMultiWindowMode = codedInputByteBufferNano.readBool();
                } else if (tag == 64) {
                    this.isInLandscapeMode = codedInputByteBufferNano.readBool();
                } else if (tag == 74) {
                    if (this.extension == null) {
                        this.extension = new LauncherLogExtensions.LauncherEventExtension();
                    }
                    codedInputByteBufferNano.readMessage(this.extension);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class Target extends MessageNano {
        private static volatile Target[] _emptyArray;
        public int cardinality;
        public int componentHash;
        public int containerType;
        public int controlType;
        public LauncherLogExtensions.TargetExtension extension;
        public int gridX;
        public int gridY;
        public int intentHash;
        public int itemType;
        public int packageNameHash;
        public int pageIndex;
        public int predictedRank;
        public int rank;
        public int spanX;
        public int spanY;
        public int tipType;
        public int type;

        public interface Type {
            public static final int CONTAINER = 3;
            public static final int CONTROL = 2;
            public static final int ITEM = 1;
            public static final int NONE = 0;
        }

        public Target() {
            clear();
        }

        public static Target[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Target[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Target parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Target) MessageNano.mergeFrom(new Target(), bArr);
        }

        public Target clear() {
            this.type = 0;
            this.pageIndex = 0;
            this.rank = 0;
            this.gridX = 0;
            this.gridY = 0;
            this.containerType = 0;
            this.cardinality = 0;
            this.controlType = 0;
            this.itemType = 0;
            this.packageNameHash = 0;
            this.componentHash = 0;
            this.intentHash = 0;
            this.spanX = 1;
            this.spanY = 1;
            this.predictedRank = 0;
            this.extension = null;
            this.tipType = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i10 = this.type;
            if (i10 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
            }
            int i11 = this.pageIndex;
            if (i11 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i11);
            }
            int i12 = this.rank;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i12);
            }
            int i13 = this.gridX;
            if (i13 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
            }
            int i14 = this.gridY;
            if (i14 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i14);
            }
            int i15 = this.containerType;
            if (i15 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i15);
            }
            int i16 = this.cardinality;
            if (i16 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i16);
            }
            int i17 = this.controlType;
            if (i17 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i17);
            }
            int i18 = this.itemType;
            if (i18 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i18);
            }
            int i19 = this.packageNameHash;
            if (i19 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i19);
            }
            int i20 = this.componentHash;
            if (i20 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(11, i20);
            }
            int i21 = this.intentHash;
            if (i21 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i21);
            }
            int i22 = this.spanX;
            if (i22 != 1) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(13, i22);
            }
            int i23 = this.spanY;
            if (i23 != 1) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i23);
            }
            int i24 = this.predictedRank;
            if (i24 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i24);
            }
            LauncherLogExtensions.TargetExtension targetExtension = this.extension;
            if (targetExtension != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(16, targetExtension);
            }
            int i25 = this.tipType;
            return i25 != 0 ? CodedOutputByteBufferNano.computeInt32Size(17, i25) + iComputeSerializedSize : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i10 = this.type;
            if (i10 != 0) {
                codedOutputByteBufferNano.writeInt32(1, i10);
            }
            int i11 = this.pageIndex;
            if (i11 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i11);
            }
            int i12 = this.rank;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(3, i12);
            }
            int i13 = this.gridX;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeInt32(4, i13);
            }
            int i14 = this.gridY;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeInt32(5, i14);
            }
            int i15 = this.containerType;
            if (i15 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i15);
            }
            int i16 = this.cardinality;
            if (i16 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i16);
            }
            int i17 = this.controlType;
            if (i17 != 0) {
                codedOutputByteBufferNano.writeInt32(8, i17);
            }
            int i18 = this.itemType;
            if (i18 != 0) {
                codedOutputByteBufferNano.writeInt32(9, i18);
            }
            int i19 = this.packageNameHash;
            if (i19 != 0) {
                codedOutputByteBufferNano.writeInt32(10, i19);
            }
            int i20 = this.componentHash;
            if (i20 != 0) {
                codedOutputByteBufferNano.writeInt32(11, i20);
            }
            int i21 = this.intentHash;
            if (i21 != 0) {
                codedOutputByteBufferNano.writeInt32(12, i21);
            }
            int i22 = this.spanX;
            if (i22 != 1) {
                codedOutputByteBufferNano.writeInt32(13, i22);
            }
            int i23 = this.spanY;
            if (i23 != 1) {
                codedOutputByteBufferNano.writeInt32(14, i23);
            }
            int i24 = this.predictedRank;
            if (i24 != 0) {
                codedOutputByteBufferNano.writeInt32(15, i24);
            }
            LauncherLogExtensions.TargetExtension targetExtension = this.extension;
            if (targetExtension != null) {
                codedOutputByteBufferNano.writeMessage(16, targetExtension);
            }
            int i25 = this.tipType;
            if (i25 != 0) {
                codedOutputByteBufferNano.writeInt32(17, i25);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static Target parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new Target().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public Target mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                            this.type = int32;
                        }
                        break;
                    case 16:
                        this.pageIndex = codedInputByteBufferNano.readInt32();
                        break;
                    case 24:
                        this.rank = codedInputByteBufferNano.readInt32();
                        break;
                    case 32:
                        this.gridX = codedInputByteBufferNano.readInt32();
                        break;
                    case 40:
                        this.gridY = codedInputByteBufferNano.readInt32();
                        break;
                    case 48:
                        int int322 = codedInputByteBufferNano.readInt32();
                        switch (int322) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                this.containerType = int322;
                                break;
                        }
                        break;
                    case 56:
                        this.cardinality = codedInputByteBufferNano.readInt32();
                        break;
                    case 64:
                        int int323 = codedInputByteBufferNano.readInt32();
                        switch (int323) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                                this.controlType = int323;
                                break;
                        }
                        break;
                    case 72:
                        int int324 = codedInputByteBufferNano.readInt32();
                        switch (int324) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.itemType = int324;
                                break;
                        }
                        break;
                    case 80:
                        this.packageNameHash = codedInputByteBufferNano.readInt32();
                        break;
                    case 88:
                        this.componentHash = codedInputByteBufferNano.readInt32();
                        break;
                    case 96:
                        this.intentHash = codedInputByteBufferNano.readInt32();
                        break;
                    case 104:
                        this.spanX = codedInputByteBufferNano.readInt32();
                        break;
                    case 112:
                        this.spanY = codedInputByteBufferNano.readInt32();
                        break;
                    case 120:
                        this.predictedRank = codedInputByteBufferNano.readInt32();
                        break;
                    case 130:
                        if (this.extension == null) {
                            this.extension = new LauncherLogExtensions.TargetExtension();
                        }
                        codedInputByteBufferNano.readMessage(this.extension);
                        break;
                    case Opcodes.L2I /* 136 */:
                        int int325 = codedInputByteBufferNano.readInt32();
                        if (int325 == 0 || int325 == 1 || int325 == 2 || int325 == 3 || int325 == 4) {
                            this.tipType = int325;
                        }
                        break;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        }
                        break;
                }
            }
            return this;
        }
    }

    public interface TipType {
        public static final int BOUNCE = 1;
        public static final int DEFAULT_NONE = 0;
        public static final int PREDICTION_TEXT = 4;
        public static final int QUICK_SCRUB_TEXT = 3;
        public static final int SWIPE_UP_TEXT = 2;
    }
}
