<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

/* @var $this yii\web\View */
/* @var $model app\models\Zamowienia */
/* @var $form yii\widgets\ActiveForm */
?>

<div class="zamowienia-form">

    <?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'nr_zamowienia')->textInput() ?>

    <?= $form->field($model, 'id_klienta')->textInput() ?>

    <?= $form->field($model, 'kwota')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'numer')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'ilosc')->textInput() ?>

    <?= $form->field($model, 'sposob_odbioru')->textInput(['maxlength' => true]) ?>

    <?= $form->field($model, 'czy_zaplacono')->textInput(['maxlength' => true]) ?>

    <div class="form-group">
        <?= Html::submitButton('Save', ['class' => 'btn btn-success']) ?>
    </div>

    <?php ActiveForm::end(); ?>

</div>
