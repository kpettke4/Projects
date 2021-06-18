<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\Zamowienia */

$this->title = 'Update Zamowienia: ' . $model->nr_zamowienia;
$this->params['breadcrumbs'][] = ['label' => 'Zamowienias', 'url' => ['index']];
$this->params['breadcrumbs'][] = ['label' => $model->nr_zamowienia, 'url' => ['view', 'id' => $model->nr_zamowienia]];
$this->params['breadcrumbs'][] = 'Update';
?>
<div class="zamowienia-update">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
