<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\Czesci */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="czesci-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'numer')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'nazwa')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'model')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'opis')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'typ_silnika')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'stan')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'cena')->textInput() ?>

    <div class="form-group">
        <?= Html::submitButton('Save', ['class' => 'btn btn-success']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
