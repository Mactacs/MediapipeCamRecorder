package com.mactacs.mediapipecamrecorder

import androidx.lifecycle.ViewModel
import com.mactacs.mediapipecamrecorder.utils.ImageSegmenterHelper

/**
 *  This ViewModel is used to store image segmenter helper settings
 */
class MainViewModel : ViewModel() {

    private var _delegate: Int = ImageSegmenterHelper.DELEGATE_CPU
    private var _model: Int = ImageSegmenterHelper.MODEL_DEEPLABV3

    val currentDelegate: Int get() = _delegate
    val currentModel: Int get() = _model

    fun setDelegate(delegate: Int) {
        _delegate = delegate
    }

    fun setModel(model: Int) {
        _model = model
    }
}
