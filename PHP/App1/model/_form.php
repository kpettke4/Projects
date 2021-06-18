<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\Model */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="model-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'marka')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'rocznik')->textInput() ?>

    <?= $form->field($model, 'kolor')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'rodzaj_nadwozia')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'typ_silnika')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'id_modelu')->textInput(['maxlength' => true]) ?>

    <div class="form-group">
        <?= Html::submitButton('Save', ['class' => 'btn btn-success']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
