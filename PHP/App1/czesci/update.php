<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\Czesci */

$this->title = 'Update Czesci: ' . $model->numer;
$this->params['breadcrumbs'][] = ['label' => 'Czescis', 'url' => ['index']];
$this->params['breadcrumbs'][] = ['label' => $model->numer, 'url' => ['view', 'id' => $model->numer]];
$this->params['breadcrumbs'][] = 'Update';
?>
<div class="czesci-update">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
