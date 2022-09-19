<template>
<!-- eslint-disable -->
  <div class="test">
    <h1>{{ t("components.headlines.helloWorld") }}</h1>
  </div>
  <div class="container">
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.colors") }}</h1>
      </div>
      <div class="col sm-9">
        <div class="p-3 mb-2 bg-primary text-white">
          .bg-primary
        </div>
        <div class="p-3 mb-2 bg-secondary text-white">
          .bg-secondary
        </div>
        <div class="p-3 mb-2 bg-success text-white">
          .bg-success
        </div>
        <div class="p-3 mb-2 bg-danger text-white">
          .bg-danger
        </div>
        <div class="p-3 mb-2 bg-warning text-white">
          .bg-warning
        </div>
        <div class="p-3 mb-2 bg-info text-white">
          .bg-info
        </div>
        <div class="p-3 mb-2 bg-light text-dark">
          .bg-light
        </div>
        <div class="p-3 mb-2 bg-dark text-white">
          .bg-dark
        </div>
        <div class="p-3 mb-2 bg-body text-dark">
          .bg-body
        </div>
        <div class="p-3 mb-2 bg-transparent text-dark">
          .bg-transparent
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.buttons") }}</h1>
      </div>
      <div class="col sm-9">
        <div class="mb-4">
          <button
            type="button"
            class="btn btn-primary mb-3"
          >
            Primary
          </button>
          <button
            type="button"
            class="btn btn-secondary mb-3"
          >
            Secondary
          </button>
          <button
            type="button"
            class="btn btn-success mb-3"
          >
            Success
          </button>
          <button
            type="button"
            class="btn btn-danger mb-3"
          >
            Danger
          </button>
          <button
            type="button"
            class="btn btn-warning mb-3"
          >
            Warning
          </button>
          <button
            type="button"
            class="btn btn-info mb-3"
          >
            Info
          </button>
          <button
            type="button"
            class="btn btn-light mb-3"
          >
            Light
          </button>
          <button
            type="button"
            class="btn btn-dark mb-3"
          >
            Dark
          </button>
          <button
            type="button"
            class="btn btn-link mb-3"
          >
            Link
          </button>
        </div>
        <div class="mb-4">
          <button
            type="button"
            class="btn btn-outline-primary mb-3"
          >
            Primary
          </button>
          <button
            type="button"
            class="btn btn-outline-secondary mb-3"
          >
            Secondary
          </button>
          <button
            type="button"
            class="btn btn-outline-success mb-3"
          >
            Success
          </button>
          <button
            type="button"
            class="btn btn-outline-danger mb-3"
          >
            Danger
          </button>
          <button
            type="button"
            class="btn btn-outline-warning mb-3"
          >
            Warning
          </button>
          <button
            type="button"
            class="btn btn-outline-info mb-3"
          >
            Info
          </button>
          <button
            type="button"
            class="btn btn-outline-light mb-3"
          >
            Light
          </button>
          <button
            type="button"
            class="btn btn-outline-dark mb-3"
          >
            Dark
          </button>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.modals") }}</h1>
      </div>
      <div class="col sm-9">
        <!-- Button trigger modal -->
        <button
          type="button"
          class="btn btn-primary"
          data-bs-toggle="modal"
          data-bs-target="#exampleModal"
        >
          {{ t("components.buttons.launchModal") }}
        </button>
      </div>
    </div>
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.spinners") }}</h1>
      </div>
      <div class="col sm-9">
        <div class="label">
          {{ t("components.headlines.customSize") }}
        </div>
        <div class="indicators">
          <DxLoadIndicator
            id="small-indicator"
            :height="20"
            :width="20"
          />
          <DxLoadIndicator
            id="medium-indicator"
            :height="40"
            :width="40"
          />
          <DxLoadIndicator
            id="large-indicator"
            :height="60"
            :width="60"
          />
        </div>
        <div class="label">
          {{ t("components.headlines.customImage") }}
        </div>

        <DxLoadIndicator
          id="image-indicator"
          :indicator-src="require('@/images/earth.gif')"
          :height="120"
          :width="260"
        />
      </div>
      <!-- Modal -->
      <div
        class="modal fade"
        id="exampleModal"
        tabindex="-1"
        aria-labelledby="exampleModalLabel"
        aria-hidden="true"
      >
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5
                class="modal-title"
                id="exampleModalLabel"
              >
                {{ t("components.modal.title") }}
              </h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="modal"
                aria-label="Close"
              />
            </div>
            <div class="modal-body">
              {{ t("components.modal.body") }}
            </div>
            <div class="modal-footer">
              <button
                type="button"
                class="btn btn-secondary"
                data-bs-dismiss="modal"
              >
                {{ t("components.modal.buttons.cancel") }}
              </button>
              <button
                type="button"
                class="btn btn-primary"
              >
                {{ t("components.modal.buttons.save") }}
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.dataGrid") }}</h1>
      </div>
      <div class="col sm-9">
        <DxDataGrid
          :data-source="dataSource"
          :remote-operations="false"
          :allow-column-reordering="true"
          :row-alternation-enabled="true"
          :show-borders="true"
          @content-ready="onContentReady"
        >
          <DxColumn
            :group-index="0"
            data-field="Product"
          />
          <DxColumn
            data-field="Amount"
            caption="Sale Amount"
            data-type="number"
            format="currency"
            alignment="right"
          />
          <DxColumn
            :allow-grouping="false"
            data-field="Discount"
            caption="Discount %"
            data-type="number"
            format="percent"
            alignment="right"
            cell-template="discountCellTemplate"
            css-class="bullet"
          />
          <DxColumn
            data-field="SaleDate"
            data-type="date"
          />
          <DxColumn
            data-field="Region"
            data-type="string"
          />
          <DxColumn
            data-field="Sector"
            data-type="string"
          />
          <DxColumn
            data-field="Channel"
            data-type="string"
          />
          <DxColumn
            :width="150"
            data-field="Customer"
            data-type="string"
          />
          <DxGroupPanel :visible="true" />
          <DxSearchPanel
            :visible="true"
            :highlight-case-sensitive="true"
          />
          <DxGrouping :auto-expand-all="false" />
          <DxPager
            :allowed-page-sizes="pageSizes"
            :show-page-size-selector="true"
          />
          <DxPaging :page-size="10" />
          <template #discountCellTemplate="{ data: cellData }">
            <DiscountCell :cell-data="cellData" />
          </template>
        </DxDataGrid>
      </div>
    </div>
    <div class="row">
      <div class="col sm-3">
        <h1>{{ t("components.headlines.veeValidate") }}</h1>
      </div>
      <div class="col sm-9">
        <ValidationForm
          @submit="onSubmit()"
          v-slot="{ meta, values }"
        >
          <Field
            name="email"
            type="email"
            rules="email"
            :validate-on-change="true"
            :validate-on-input="true"
            :class="[
              {
                'is-valid':
                  meta.valid && values['email'] !== '' && values['email'] !== undefined,
              },
              {
                'is-invalid':
                  !meta.valid || values['email'] === '' || values.email === undefined,
              },
              'form-control',
            ]"
          />
          <ErrorMessage name="email" />
          <button>{{ t("components.modal.buttons.save") }}</button>
        </ValidationForm>
      </div>
    </div>
  </div>
</template>
<script setup lang="ts">
import { ref, inject } from "vue";
import { DxLoadIndicator } from "devextreme-vue/load-indicator";
import DataSource from "devextreme/data/data_source";
import "devextreme/data/odata/store";
import DiscountCell from "./DiscountCell.vue";
import { Form as ValidationForm, Field, ErrorMessage, configure, defineRule } from "vee-validate";
import { email } from '@vee-validate/rules';
import { TranslationFunction } from "@/types";
import {
    DxDataGrid,
    DxColumn,
    DxGrouping,
    DxGroupPanel,
    DxPager,
    DxPaging,
    DxSearchPanel,
} from "devextreme-vue/data-grid";

const collapsed = ref(false),
    dataSource = ref(
        new DataSource({
            store: {
                type: "odata",
                url: "https://js.devexpress.com/Demos/SalesViewer/odata/DaySaleDtoes",
                key: "Id",
                beforeSend(request) {
                    request.params.startDate = "2020-05-10";
                    request.params.endDate = "2020-05-15";
                },
            },
        })
    ),
    pageSizes = ref([10, 25, 50, 100]),
    onContentReady = function (e: any) {
        if (!collapsed.value) {
            e.component.expandRow(["EnviroCare"]);
            collapsed.value = true;
        }
    },
    onSubmit = function () {
        // blah
    },
    t = inject("t") as TranslationFunction;
configure({
    generateMessage: () => {
        return t("formValidationErrors.email").toString();
    },
});

defineRule('email', email);
</script>
