<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\StanMagazynu */

$this->title = 'Update Stan Magazynu: ' . $model->nazwa;
$this->params['breadcrumbs'][] = ['label' => 'Stan Magazynus', 'url' => ['index']];
$this->params['breadcrumbs'][] = ['label' => $model->nazwa, 'url' => ['view', 'id' => $model->nazwa]];
$this->params['breadcrumbs'][] = 'Update';
?>
<div class="stan-magazynu-update">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
