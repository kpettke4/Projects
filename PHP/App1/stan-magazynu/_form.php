<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\StanMagazynu */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="stan-magazynu-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'nazwa')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'numer')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'dostepnosc')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'data_sprzedazy')->textInput() ?>

    <?= $form->field($model, 'data_dostawy')->textInput() ?>

    <div class="form-group">
        <?= Html::submitButton('Save', ['class' => 'btn btn-success']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
