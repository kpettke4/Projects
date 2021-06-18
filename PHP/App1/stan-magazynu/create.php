<?php

use yii\helpers\Html;

/* @var $this yii\web\View */
/* @var $model app\models\StanMagazynu */

$this->title = 'Create Stan Magazynu';
$this->params['breadcrumbs'][] = ['label' => 'Stan Magazynus', 'url' => ['index']];
$this->params['breadcrumbs'][] = $this->title;
?>
<div class="stan-magazynu-create">

    <h1><?= Html::encode($this->title) ?></h1>

    <?= $this->render('_form', [
        'model' => $model,
    ]) ?>

</div>
